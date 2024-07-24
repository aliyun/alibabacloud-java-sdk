// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class ListEndpointsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D6030CE6-9FEB-5B2F-84AC-3ADE3CBA89E5</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListEndpointsResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEndpointsResponseBody self = new ListEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEndpointsResponseBody setResult(java.util.List<ListEndpointsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListEndpointsResponseBodyResult> getResult() {
        return this.result;
    }

    public ListEndpointsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListEndpointsResponseBodyResultEndpointZones extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>vsw-bp194pz9iez****</p>
         */
        @NameInMap("vSwitchId")
        public String vSwitchId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-k</p>
         */
        @NameInMap("zoneId")
        public String zoneId;

        public static ListEndpointsResponseBodyResultEndpointZones build(java.util.Map<String, ?> map) throws Exception {
            ListEndpointsResponseBodyResultEndpointZones self = new ListEndpointsResponseBodyResultEndpointZones();
            return TeaModel.build(map, self);
        }

        public ListEndpointsResponseBodyResultEndpointZones setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListEndpointsResponseBodyResultEndpointZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListEndpointsResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("connectionStatus")
        public String connectionStatus;

        /**
         * <strong>example:</strong>
         * <p>1701259721</p>
         */
        @NameInMap("created")
        public Integer created;

        /**
         * <strong>example:</strong>
         * <p>ep-bp1i522d<strong><strong>a3.epsrv-bp1f</strong></strong>gei.cn-hangzhou.privatelink.aliyuncs.com</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>essep-2f46b743f60****</p>
         */
        @NameInMap("endpointId")
        public String endpointId;

        @NameInMap("endpointZones")
        public java.util.List<ListEndpointsResponseBodyResultEndpointZones> endpointZones;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>ep-bp1id41dd116e52e****</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        @NameInMap("securityGroupIds")
        public java.util.List<String> securityGroupIds;

        /**
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>1701259721</p>
         */
        @NameInMap("updated")
        public Integer updated;

        /**
         * <strong>example:</strong>
         * <p>vpc-uf6gykvwcirp886ef****</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static ListEndpointsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListEndpointsResponseBodyResult self = new ListEndpointsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListEndpointsResponseBodyResult setConnectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        public ListEndpointsResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public ListEndpointsResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListEndpointsResponseBodyResult setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public ListEndpointsResponseBodyResult setEndpointZones(java.util.List<ListEndpointsResponseBodyResultEndpointZones> endpointZones) {
            this.endpointZones = endpointZones;
            return this;
        }
        public java.util.List<ListEndpointsResponseBodyResultEndpointZones> getEndpointZones() {
            return this.endpointZones;
        }

        public ListEndpointsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEndpointsResponseBodyResult setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListEndpointsResponseBodyResult setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public ListEndpointsResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListEndpointsResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListEndpointsResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

        public ListEndpointsResponseBodyResult setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
