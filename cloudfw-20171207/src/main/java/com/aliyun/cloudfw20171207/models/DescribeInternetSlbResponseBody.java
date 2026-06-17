// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInternetSlbResponseBody extends TeaModel {
    /**
     * <p>The list of data.</p>
     */
    @NameInMap("DataList")
    public java.util.List<DescribeInternetSlbResponseBodyDataList> dataList;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeInternetSlbResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>135BF83A-0416-5A11-96BB-FA7604D4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInternetSlbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInternetSlbResponseBody self = new DescribeInternetSlbResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInternetSlbResponseBody setDataList(java.util.List<DescribeInternetSlbResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeInternetSlbResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeInternetSlbResponseBody setPageInfo(DescribeInternetSlbResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeInternetSlbResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeInternetSlbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInternetSlbResponseBodyDataList extends TeaModel {
        /**
         * <p>The access control ID.</p>
         * 
         * <strong>example:</strong>
         * <p>acl-uf66n6l9mf3fgq8xs****</p>
         */
        @NameInMap("AclId")
        public String aclId;

        /**
         * <p>The status of access control.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AclStatus")
        public String aclStatus;

        /**
         * <p>The access control type.</p>
         * 
         * <strong>example:</strong>
         * <p>white</p>
         */
        @NameInMap("AclType")
        public String aclType;

        /**
         * <p>The health check status.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("HealthStatus")
        public String healthStatus;

        /**
         * <p>The ID of the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-2ze8v2x5kd9qyvp2****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>buyerpro1</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The protocol type.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The port number.</p>
         * 
         * <strong>example:</strong>
         * <p>1883</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>39.108.57.XXX</p>
         */
        @NameInMap("PublicIp")
        public String publicIp;

        /**
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<String> tags;

        public static DescribeInternetSlbResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInternetSlbResponseBodyDataList self = new DescribeInternetSlbResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeInternetSlbResponseBodyDataList setAclId(String aclId) {
            this.aclId = aclId;
            return this;
        }
        public String getAclId() {
            return this.aclId;
        }

        public DescribeInternetSlbResponseBodyDataList setAclStatus(String aclStatus) {
            this.aclStatus = aclStatus;
            return this;
        }
        public String getAclStatus() {
            return this.aclStatus;
        }

        public DescribeInternetSlbResponseBodyDataList setAclType(String aclType) {
            this.aclType = aclType;
            return this;
        }
        public String getAclType() {
            return this.aclType;
        }

        public DescribeInternetSlbResponseBodyDataList setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public DescribeInternetSlbResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInternetSlbResponseBodyDataList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeInternetSlbResponseBodyDataList setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public DescribeInternetSlbResponseBodyDataList setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeInternetSlbResponseBodyDataList setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public DescribeInternetSlbResponseBodyDataList setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeInternetSlbResponseBodyDataList setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

    }

    public static class DescribeInternetSlbResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeInternetSlbResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeInternetSlbResponseBodyPageInfo self = new DescribeInternetSlbResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeInternetSlbResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeInternetSlbResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeInternetSlbResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
