// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UploadModuleAdvanceRequest extends TeaModel {
    /**
     * <p>The template content.</p>
     */
    @NameInMap("code")
    public java.util.Map<String, String> code;

    /**
     * <p>The module ID. This parameter is valid and required when resourceType is set to Module.</p>
     * 
     * <strong>example:</strong>
     * <p>mod-kw1018ogp2m3qp22b3k31d</p>
     */
    @NameInMap("moduleId")
    public String moduleId;

    /**
     * <p>The name of the module. This parameter is valid and required when resourceType is set to RegistryModule.</p>
     * 
     * <strong>example:</strong>
     * <p>RegistryModule-test0ef88</p>
     */
    @NameInMap("moduleName")
    public String moduleName;

    /**
     * <p>The workspace name. This parameter is valid and required when resourceType is set to RegistryModule.</p>
     * 
     * <strong>example:</strong>
     * <p>test_namespace</p>
     */
    @NameInMap("namespaceName")
    public String namespaceName;

    /**
     * <p>The local zip file to upload. The file size cannot exceed 10 MB.</p>
     * 
     * <strong>example:</strong>
     * <p>url</p>
     */
    @NameInMap("url")
    public java.io.InputStream urlObject;

    public static UploadModuleAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadModuleAdvanceRequest self = new UploadModuleAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public UploadModuleAdvanceRequest setCode(java.util.Map<String, String> code) {
        this.code = code;
        return this;
    }
    public java.util.Map<String, String> getCode() {
        return this.code;
    }

    public UploadModuleAdvanceRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public UploadModuleAdvanceRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public UploadModuleAdvanceRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public UploadModuleAdvanceRequest setUrlObject(java.io.InputStream urlObject) {
        this.urlObject = urlObject;
        return this;
    }
    public java.io.InputStream getUrlObject() {
        return this.urlObject;
    }

}
