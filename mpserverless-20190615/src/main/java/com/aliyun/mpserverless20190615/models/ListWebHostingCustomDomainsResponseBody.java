// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListWebHostingCustomDomainsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListWebHostingCustomDomainsResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListWebHostingCustomDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWebHostingCustomDomainsResponseBody self = new ListWebHostingCustomDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWebHostingCustomDomainsResponseBody setData(java.util.List<ListWebHostingCustomDomainsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListWebHostingCustomDomainsResponseBodyData> getData() {
        return this.data;
    }

    public ListWebHostingCustomDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListWebHostingCustomDomainsResponseBodyData extends TeaModel {
        @NameInMap("AccessControlAllowOrigin")
        public String accessControlAllowOrigin;

        @NameInMap("AccessOriginControl")
        public Boolean accessOriginControl;

        @NameInMap("Cname")
        public String cname;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("EnableCors")
        public Boolean enableCors;

        @NameInMap("ForceRedirectType")
        public String forceRedirectType;

        @NameInMap("SslProtocol")
        public String sslProtocol;

        @NameInMap("Status")
        public String status;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListWebHostingCustomDomainsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListWebHostingCustomDomainsResponseBodyData self = new ListWebHostingCustomDomainsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListWebHostingCustomDomainsResponseBodyData setAccessControlAllowOrigin(String accessControlAllowOrigin) {
            this.accessControlAllowOrigin = accessControlAllowOrigin;
            return this;
        }
        public String getAccessControlAllowOrigin() {
            return this.accessControlAllowOrigin;
        }

        public ListWebHostingCustomDomainsResponseBodyData setAccessOriginControl(Boolean accessOriginControl) {
            this.accessOriginControl = accessOriginControl;
            return this;
        }
        public Boolean getAccessOriginControl() {
            return this.accessOriginControl;
        }

        public ListWebHostingCustomDomainsResponseBodyData setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public ListWebHostingCustomDomainsResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListWebHostingCustomDomainsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListWebHostingCustomDomainsResponseBodyData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListWebHostingCustomDomainsResponseBodyData setEnableCors(Boolean enableCors) {
            this.enableCors = enableCors;
            return this;
        }
        public Boolean getEnableCors() {
            return this.enableCors;
        }

        public ListWebHostingCustomDomainsResponseBodyData setForceRedirectType(String forceRedirectType) {
            this.forceRedirectType = forceRedirectType;
            return this;
        }
        public String getForceRedirectType() {
            return this.forceRedirectType;
        }

        public ListWebHostingCustomDomainsResponseBodyData setSslProtocol(String sslProtocol) {
            this.sslProtocol = sslProtocol;
            return this;
        }
        public String getSslProtocol() {
            return this.sslProtocol;
        }

        public ListWebHostingCustomDomainsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListWebHostingCustomDomainsResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
