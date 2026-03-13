// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UploadModuleRequest extends TeaModel {
    @NameInMap("code")
    public java.util.Map<String, String> code;

    /**
     * <strong>example:</strong>
     * <p>mod-kw1018ogp2m3qp22b3k31d</p>
     */
    @NameInMap("moduleId")
    public String moduleId;

    /**
     * <strong>example:</strong>
     * <p>RegistryModule-test0ef88</p>
     */
    @NameInMap("moduleName")
    public String moduleName;

    /**
     * <strong>example:</strong>
     * <p>test_namespace</p>
     */
    @NameInMap("namespaceName")
    public String namespaceName;

    /**
     * <strong>example:</strong>
     * <p>url</p>
     */
    @NameInMap("url")
    public String url;

    public static UploadModuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadModuleRequest self = new UploadModuleRequest();
        return TeaModel.build(map, self);
    }

    public UploadModuleRequest setCode(java.util.Map<String, String> code) {
        this.code = code;
        return this;
    }
    public java.util.Map<String, String> getCode() {
        return this.code;
    }

    public UploadModuleRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public UploadModuleRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public UploadModuleRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public UploadModuleRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
