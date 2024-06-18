// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateLiveRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="http://sss/sss">http://sss/sss</a></p>
     */
    @NameInMap("CoverUrl")
    public String coverUrl;

    /**
     * <strong>example:</strong>
     * <p>这是一个直播</p>
     */
    @NameInMap("Introduction")
    public String introduction;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1698596800000</p>
     */
    @NameInMap("PreEndTime")
    public Long preEndTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1691596800000</p>
     */
    @NameInMap("PreStartTime")
    public Long preStartTime;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PublicType")
    public Long publicType;

    @NameInMap("TenantContext")
    public CreateLiveRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>标题</p>
     */
    @NameInMap("Title")
    public String title;

    public static CreateLiveRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveRequest self = new CreateLiveRequest();
        return TeaModel.build(map, self);
    }

    public CreateLiveRequest setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }
    public String getCoverUrl() {
        return this.coverUrl;
    }

    public CreateLiveRequest setIntroduction(String introduction) {
        this.introduction = introduction;
        return this;
    }
    public String getIntroduction() {
        return this.introduction;
    }

    public CreateLiveRequest setPreEndTime(Long preEndTime) {
        this.preEndTime = preEndTime;
        return this;
    }
    public Long getPreEndTime() {
        return this.preEndTime;
    }

    public CreateLiveRequest setPreStartTime(Long preStartTime) {
        this.preStartTime = preStartTime;
        return this;
    }
    public Long getPreStartTime() {
        return this.preStartTime;
    }

    public CreateLiveRequest setPublicType(Long publicType) {
        this.publicType = publicType;
        return this;
    }
    public Long getPublicType() {
        return this.publicType;
    }

    public CreateLiveRequest setTenantContext(CreateLiveRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public CreateLiveRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public CreateLiveRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public static class CreateLiveRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static CreateLiveRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            CreateLiveRequestTenantContext self = new CreateLiveRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public CreateLiveRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
