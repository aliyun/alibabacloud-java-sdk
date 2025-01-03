// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetApplicationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>应用模版展示名称A</p>
     */
    @NameInMap("appTemplateDisplayName")
    public String appTemplateDisplayName;

    /**
     * <strong>example:</strong>
     * <p>应用模版名称A</p>
     */
    @NameInMap("appTemplateName")
    public String appTemplateName;

    /**
     * <strong>example:</strong>
     * <p>1332695887xxxxxx</p>
     */
    @NameInMap("creatorAccountId")
    public String creatorAccountId;

    /**
     * <strong>example:</strong>
     * <p>应用描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>2024-01-01T00:00:00.000+00:00</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>testApp</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>FC93CE1A-8D7A-13A9-8306-7465DE2E5C0F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationResponseBody self = new GetApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationResponseBody setAppTemplateDisplayName(String appTemplateDisplayName) {
        this.appTemplateDisplayName = appTemplateDisplayName;
        return this;
    }
    public String getAppTemplateDisplayName() {
        return this.appTemplateDisplayName;
    }

    public GetApplicationResponseBody setAppTemplateName(String appTemplateName) {
        this.appTemplateName = appTemplateName;
        return this;
    }
    public String getAppTemplateName() {
        return this.appTemplateName;
    }

    public GetApplicationResponseBody setCreatorAccountId(String creatorAccountId) {
        this.creatorAccountId = creatorAccountId;
        return this;
    }
    public String getCreatorAccountId() {
        return this.creatorAccountId;
    }

    public GetApplicationResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetApplicationResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public GetApplicationResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
