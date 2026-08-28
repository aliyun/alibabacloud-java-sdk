// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListSourcesResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public ListSourcesResponseBodyData data;

    /**
     * <p>The response message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8FA9BB94-915B-5299-A694-49FCC7F5DD00</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSourcesResponseBody self = new ListSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSourcesResponseBody setData(ListSourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSourcesResponseBodyData getData() {
        return this.data;
    }

    public ListSourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSourcesResponseBodyDataItemsK8sSourceInfo extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c09212180612a42adbed6a940d01d***</p>
         */
        @NameInMap("clusterId")
        public String clusterId;

        public static ListSourcesResponseBodyDataItemsK8sSourceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListSourcesResponseBodyDataItemsK8sSourceInfo self = new ListSourcesResponseBodyDataItemsK8sSourceInfo();
            return TeaModel.build(map, self);
        }

        public ListSourcesResponseBodyDataItemsK8sSourceInfo setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

    public static class ListSourcesResponseBodyDataItemsNacosSourceInfo extends TeaModel {
        /**
         * <p>The endpoint of the Nacos instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-3353***-nacos-ans.mse.aliyuncs.com:8848</p>
         */
        @NameInMap("address")
        public String address;

        /**
         * <p>The registry ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-3353***</p>
         */
        @NameInMap("clusterId")
        public String clusterId;

        /**
         * <p>The Nacos instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mse_prepaid_public_cn-wuf***</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        public static ListSourcesResponseBodyDataItemsNacosSourceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListSourcesResponseBodyDataItemsNacosSourceInfo self = new ListSourcesResponseBodyDataItemsNacosSourceInfo();
            return TeaModel.build(map, self);
        }

        public ListSourcesResponseBodyDataItemsNacosSourceInfo setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ListSourcesResponseBodyDataItemsNacosSourceInfo setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListSourcesResponseBodyDataItemsNacosSourceInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class ListSourcesResponseBodyDataItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Association completed</p>
         */
        @NameInMap("associationReason")
        public String associationReason;

        /**
         * <strong>example:</strong>
         * <p>ASSOCIATED</p>
         */
        @NameInMap("associationStatus")
        public String associationStatus;

        /**
         * <p>The creation timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1719386834548</p>
         */
        @NameInMap("createTimestamp")
        public Long createTimestamp;

        /**
         * <p>The source information when the source type is K8S.</p>
         */
        @NameInMap("k8sSourceInfo")
        public ListSourcesResponseBodyDataItemsK8sSourceInfo k8sSourceInfo;

        /**
         * <p>The source information when the source type is MSE_NACOS.</p>
         */
        @NameInMap("nacosSourceInfo")
        public ListSourcesResponseBodyDataItemsNacosSourceInfo nacosSourceInfo;

        /**
         * <p>The source name. If the source type is K8S, the name is the container cluster name. If the source type is MSE_NACOS, the name is the Nacos instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>itemcenter-dev-cluster</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>rg-xxxx</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>src-crdddallhtgtria***</p>
         */
        @NameInMap("sourceId")
        public String sourceId;

        /**
         * <p>The update timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1719386834548</p>
         */
        @NameInMap("updateTimestamp")
        public Long updateTimestamp;

        public static ListSourcesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListSourcesResponseBodyDataItems self = new ListSourcesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListSourcesResponseBodyDataItems setAssociationReason(String associationReason) {
            this.associationReason = associationReason;
            return this;
        }
        public String getAssociationReason() {
            return this.associationReason;
        }

        public ListSourcesResponseBodyDataItems setAssociationStatus(String associationStatus) {
            this.associationStatus = associationStatus;
            return this;
        }
        public String getAssociationStatus() {
            return this.associationStatus;
        }

        public ListSourcesResponseBodyDataItems setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public ListSourcesResponseBodyDataItems setK8sSourceInfo(ListSourcesResponseBodyDataItemsK8sSourceInfo k8sSourceInfo) {
            this.k8sSourceInfo = k8sSourceInfo;
            return this;
        }
        public ListSourcesResponseBodyDataItemsK8sSourceInfo getK8sSourceInfo() {
            return this.k8sSourceInfo;
        }

        public ListSourcesResponseBodyDataItems setNacosSourceInfo(ListSourcesResponseBodyDataItemsNacosSourceInfo nacosSourceInfo) {
            this.nacosSourceInfo = nacosSourceInfo;
            return this;
        }
        public ListSourcesResponseBodyDataItemsNacosSourceInfo getNacosSourceInfo() {
            return this.nacosSourceInfo;
        }

        public ListSourcesResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSourcesResponseBodyDataItems setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListSourcesResponseBodyDataItems setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public ListSourcesResponseBodyDataItems setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

    }

    public static class ListSourcesResponseBodyData extends TeaModel {
        /**
         * <p>The list of sources.</p>
         */
        @NameInMap("items")
        public java.util.List<ListSourcesResponseBodyDataItems> items;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalSize")
        public Integer totalSize;

        public static ListSourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSourcesResponseBodyData self = new ListSourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSourcesResponseBodyData setItems(java.util.List<ListSourcesResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListSourcesResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListSourcesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListSourcesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSourcesResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
