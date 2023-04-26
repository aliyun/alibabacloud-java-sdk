// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListErsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public ListErsResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListErsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListErsResponseBody self = new ListErsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListErsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListErsResponseBody setContent(ListErsResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListErsResponseBodyContent getContent() {
        return this.content;
    }

    public ListErsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListErsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListErsResponseBodyContentData extends TeaModel {
        @NameInMap("Connections")
        public Long connections;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ErId")
        public String erId;

        @NameInMap("ErName")
        public String erName;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("MasterZoneId")
        public String masterZoneId;

        @NameInMap("Message")
        public String message;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RouteMaps")
        public Long routeMaps;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public String tenantId;

        public static ListErsResponseBodyContentData build(java.util.Map<String, ?> map) throws Exception {
            ListErsResponseBodyContentData self = new ListErsResponseBodyContentData();
            return TeaModel.build(map, self);
        }

        public ListErsResponseBodyContentData setConnections(Long connections) {
            this.connections = connections;
            return this;
        }
        public Long getConnections() {
            return this.connections;
        }

        public ListErsResponseBodyContentData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListErsResponseBodyContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListErsResponseBodyContentData setErId(String erId) {
            this.erId = erId;
            return this;
        }
        public String getErId() {
            return this.erId;
        }

        public ListErsResponseBodyContentData setErName(String erName) {
            this.erName = erName;
            return this;
        }
        public String getErName() {
            return this.erName;
        }

        public ListErsResponseBodyContentData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListErsResponseBodyContentData setMasterZoneId(String masterZoneId) {
            this.masterZoneId = masterZoneId;
            return this;
        }
        public String getMasterZoneId() {
            return this.masterZoneId;
        }

        public ListErsResponseBodyContentData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListErsResponseBodyContentData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListErsResponseBodyContentData setRouteMaps(Long routeMaps) {
            this.routeMaps = routeMaps;
            return this;
        }
        public Long getRouteMaps() {
            return this.routeMaps;
        }

        public ListErsResponseBodyContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListErsResponseBodyContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class ListErsResponseBodyContent extends TeaModel {
        @NameInMap("Data")
        public java.util.List<ListErsResponseBodyContentData> data;

        @NameInMap("Total")
        public Long total;

        public static ListErsResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListErsResponseBodyContent self = new ListErsResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListErsResponseBodyContent setData(java.util.List<ListErsResponseBodyContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListErsResponseBodyContentData> getData() {
            return this.data;
        }

        public ListErsResponseBodyContent setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
