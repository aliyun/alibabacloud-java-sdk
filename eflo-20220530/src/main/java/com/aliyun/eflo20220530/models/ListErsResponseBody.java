// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListErsResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Content")
    public ListErsResponseBodyContent content;

    /**
     * <p>The error message. (If the instance is in the Exception state, the exception cause is displayed.)</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AC8C713A-A9F4-5984-A5E1-76496DF35153</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListErsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListErsResponseBody self = new ListErsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListErsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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

    public static class ListErsResponseBodyContentDataTags extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static ListErsResponseBodyContentDataTags build(java.util.Map<String, ?> map) throws Exception {
            ListErsResponseBodyContentDataTags self = new ListErsResponseBodyContentDataTags();
            return TeaModel.build(map, self);
        }

        public ListErsResponseBodyContentDataTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListErsResponseBodyContentDataTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListErsResponseBodyContentData extends TeaModel {
        /**
         * <p>The number of connections to the Lingjun HUB network instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Connections")
        public Long connections;

        /**
         * <p>The time when the activation code was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1640930671000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>No description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the Lingjun HUB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>er-kkopgtne</p>
         */
        @NameInMap("ErId")
        public String erId;

        /**
         * <p>The name of the Lingjun HUB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>er-wulanchabu-main</p>
         */
        @NameInMap("ErName")
        public String erName;

        /**
         * <p>The time when the O\&amp;M task was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1640930671000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The primary zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu-b</p>
         */
        @NameInMap("MasterZoneId")
        public String masterZoneId;

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Resource group instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmv2m2w43japa</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Number of Lingjun HUB routing policy.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RouteMaps")
        public Long routeMaps;

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<ListErsResponseBodyContentDataTags> tags;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1655449505171</p>
         */
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

        public ListErsResponseBodyContentData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
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

        public ListErsResponseBodyContentData setTags(java.util.List<ListErsResponseBodyContentDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListErsResponseBodyContentDataTags> getTags() {
            return this.tags;
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
        /**
         * <p>lingjun hub information list.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListErsResponseBodyContentData> data;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
