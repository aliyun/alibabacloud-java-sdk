// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateEdgeContainerAppRecordRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-88068867578379****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The associated domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a.example.com</p>
     */
    @NameInMap("RecordName")
    public String recordName;

    /**
     * <p>The site ID.</p>
     * <blockquote>
     * <p>Notice: Although SiteId is marked as optional in the schema, it is required when you call this operation. If you omit this parameter, an InternalError (400) is returned. Call the ListSites operation to obtain a valid SiteId.</notice></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5407498413****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static CreateEdgeContainerAppRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeContainerAppRecordRequest self = new CreateEdgeContainerAppRecordRequest();
        return TeaModel.build(map, self);
    }

    public CreateEdgeContainerAppRecordRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateEdgeContainerAppRecordRequest setRecordName(String recordName) {
        this.recordName = recordName;
        return this;
    }
    public String getRecordName() {
        return this.recordName;
    }

    public CreateEdgeContainerAppRecordRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
