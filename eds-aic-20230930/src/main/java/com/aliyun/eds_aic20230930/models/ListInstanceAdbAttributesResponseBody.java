// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ListInstanceAdbAttributesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListInstanceAdbAttributesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kU+SQXzm0H9mu/FiSc****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>CB95E410-FD1D-53C5-9F7D-93CC44D7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListInstanceAdbAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceAdbAttributesResponseBody self = new ListInstanceAdbAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceAdbAttributesResponseBody setData(java.util.List<ListInstanceAdbAttributesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListInstanceAdbAttributesResponseBodyData> getData() {
        return this.data;
    }

    public ListInstanceAdbAttributesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListInstanceAdbAttributesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListInstanceAdbAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceAdbAttributesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListInstanceAdbAttributesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>183.201.219.157</p>
         */
        @NameInMap("ExternalIp")
        public String externalIp;

        /**
         * <strong>example:</strong>
         * <p>14840/14849</p>
         */
        @NameInMap("ExternalPort")
        public String externalPort;

        /**
         * <strong>example:</strong>
         * <p>2024-05-15 17:33:59</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <strong>example:</strong>
         * <p>2024-05-15 17:33:59</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>acp-uto81vfd8t8z****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>10.0.0.239</p>
         */
        @NameInMap("InternalIp")
        public String internalIp;

        /**
         * <strong>example:</strong>
         * <p>5555/5555</p>
         */
        @NameInMap("InternalPort")
        public String internalPort;

        /**
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        public static ListInstanceAdbAttributesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceAdbAttributesResponseBodyData self = new ListInstanceAdbAttributesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstanceAdbAttributesResponseBodyData setExternalIp(String externalIp) {
            this.externalIp = externalIp;
            return this;
        }
        public String getExternalIp() {
            return this.externalIp;
        }

        public ListInstanceAdbAttributesResponseBodyData setExternalPort(String externalPort) {
            this.externalPort = externalPort;
            return this;
        }
        public String getExternalPort() {
            return this.externalPort;
        }

        public ListInstanceAdbAttributesResponseBodyData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public ListInstanceAdbAttributesResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListInstanceAdbAttributesResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstanceAdbAttributesResponseBodyData setInternalIp(String internalIp) {
            this.internalIp = internalIp;
            return this;
        }
        public String getInternalIp() {
            return this.internalIp;
        }

        public ListInstanceAdbAttributesResponseBodyData setInternalPort(String internalPort) {
            this.internalPort = internalPort;
            return this;
        }
        public String getInternalPort() {
            return this.internalPort;
        }

        public ListInstanceAdbAttributesResponseBodyData setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

    }

}
