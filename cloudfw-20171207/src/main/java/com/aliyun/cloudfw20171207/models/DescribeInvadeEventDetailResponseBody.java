// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInvadeEventDetailResponseBody extends TeaModel {
    /**
     * <p>The instance ID of the asset.</p>
     * 
     * <strong>example:</strong>
     * <p>i-8vb2nmm070m****</p>
     */
    @NameInMap("AssetsInstanceId")
    public String assetsInstanceId;

    /**
     * <p>The name of the asset.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_test</p>
     */
    @NameInMap("AssetsInstanceName")
    public String assetsInstanceName;

    /**
     * <p>The description of the event.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("EventDesc")
    public String eventDesc;

    /**
     * <p>The details of the event.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("EventDetail")
    public String eventDetail;

    /**
     * <p>The key of the event.</p>
     * 
     * <strong>example:</strong>
     * <p>C&amp;CActivity</p>
     */
    @NameInMap("EventKey")
    public String eventKey;

    /**
     * <p>The name of the event.</p>
     * 
     * <strong>example:</strong>
     * <p>event_test</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The UUID of the threat detection event.</p>
     * 
     * <strong>example:</strong>
     * <p>aa6e786c-5034-457a-8e05-1c63fab****</p>
     */
    @NameInMap("EventUuid")
    public String eventUuid;

    /**
     * <p>The time when the event first occurred. This value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1735006706</p>
     */
    @NameInMap("FirstTime")
    public Integer firstTime;

    /**
     * <p>Indicates whether the event is ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsIgnore")
    public Boolean isIgnore;

    /**
     * <p>The time when the event last occurred. This value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1740104108</p>
     */
    @NameInMap("LastTime")
    public Integer lastTime;

    /**
     * <p>The list of remediation operations.</p>
     */
    @NameInMap("OperationList")
    public java.util.List<DescribeInvadeEventDetailResponseBodyOperationList> operationList;

    /**
     * <p>The private IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>10.21.186.XXX</p>
     */
    @NameInMap("PrivateIP")
    public String privateIP;

    /**
     * <p>The handling status of the event.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ProcessStatus")
    public Integer processStatus;

    /**
     * <p>The public IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>106.15.185.XXX</p>
     */
    @NameInMap("PublicIP")
    public String publicIP;

    /**
     * <p>The reference information.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Reference")
    public String reference;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8022D695-4A35-50BC-8697-EA9C233A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The risk level of the event.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RiskLevel")
    public Integer riskLevel;

    /**
     * <p>The list of unhandled operations.</p>
     */
    @NameInMap("UnhandleOperationList")
    public java.util.List<DescribeInvadeEventDetailResponseBodyUnhandleOperationList> unhandleOperationList;

    public static DescribeInvadeEventDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvadeEventDetailResponseBody self = new DescribeInvadeEventDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInvadeEventDetailResponseBody setAssetsInstanceId(String assetsInstanceId) {
        this.assetsInstanceId = assetsInstanceId;
        return this;
    }
    public String getAssetsInstanceId() {
        return this.assetsInstanceId;
    }

    public DescribeInvadeEventDetailResponseBody setAssetsInstanceName(String assetsInstanceName) {
        this.assetsInstanceName = assetsInstanceName;
        return this;
    }
    public String getAssetsInstanceName() {
        return this.assetsInstanceName;
    }

    public DescribeInvadeEventDetailResponseBody setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc;
        return this;
    }
    public String getEventDesc() {
        return this.eventDesc;
    }

    public DescribeInvadeEventDetailResponseBody setEventDetail(String eventDetail) {
        this.eventDetail = eventDetail;
        return this;
    }
    public String getEventDetail() {
        return this.eventDetail;
    }

    public DescribeInvadeEventDetailResponseBody setEventKey(String eventKey) {
        this.eventKey = eventKey;
        return this;
    }
    public String getEventKey() {
        return this.eventKey;
    }

    public DescribeInvadeEventDetailResponseBody setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public DescribeInvadeEventDetailResponseBody setEventUuid(String eventUuid) {
        this.eventUuid = eventUuid;
        return this;
    }
    public String getEventUuid() {
        return this.eventUuid;
    }

    public DescribeInvadeEventDetailResponseBody setFirstTime(Integer firstTime) {
        this.firstTime = firstTime;
        return this;
    }
    public Integer getFirstTime() {
        return this.firstTime;
    }

    public DescribeInvadeEventDetailResponseBody setIsIgnore(Boolean isIgnore) {
        this.isIgnore = isIgnore;
        return this;
    }
    public Boolean getIsIgnore() {
        return this.isIgnore;
    }

    public DescribeInvadeEventDetailResponseBody setLastTime(Integer lastTime) {
        this.lastTime = lastTime;
        return this;
    }
    public Integer getLastTime() {
        return this.lastTime;
    }

    public DescribeInvadeEventDetailResponseBody setOperationList(java.util.List<DescribeInvadeEventDetailResponseBodyOperationList> operationList) {
        this.operationList = operationList;
        return this;
    }
    public java.util.List<DescribeInvadeEventDetailResponseBodyOperationList> getOperationList() {
        return this.operationList;
    }

    public DescribeInvadeEventDetailResponseBody setPrivateIP(String privateIP) {
        this.privateIP = privateIP;
        return this;
    }
    public String getPrivateIP() {
        return this.privateIP;
    }

    public DescribeInvadeEventDetailResponseBody setProcessStatus(Integer processStatus) {
        this.processStatus = processStatus;
        return this;
    }
    public Integer getProcessStatus() {
        return this.processStatus;
    }

    public DescribeInvadeEventDetailResponseBody setPublicIP(String publicIP) {
        this.publicIP = publicIP;
        return this;
    }
    public String getPublicIP() {
        return this.publicIP;
    }

    public DescribeInvadeEventDetailResponseBody setReference(String reference) {
        this.reference = reference;
        return this;
    }
    public String getReference() {
        return this.reference;
    }

    public DescribeInvadeEventDetailResponseBody setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public DescribeInvadeEventDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInvadeEventDetailResponseBody setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    public DescribeInvadeEventDetailResponseBody setUnhandleOperationList(java.util.List<DescribeInvadeEventDetailResponseBodyUnhandleOperationList> unhandleOperationList) {
        this.unhandleOperationList = unhandleOperationList;
        return this;
    }
    public java.util.List<DescribeInvadeEventDetailResponseBodyUnhandleOperationList> getUnhandleOperationList() {
        return this.unhandleOperationList;
    }

    public static class DescribeInvadeEventDetailResponseBodyOperationList extends TeaModel {
        /**
         * <p>The parameters for the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Args")
        public String args;

        /**
         * <p>The operation.</p>
         * 
         * <strong>example:</strong>
         * <p>RunMode</p>
         */
        @NameInMap("Operate")
        public String operate;

        public static DescribeInvadeEventDetailResponseBodyOperationList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvadeEventDetailResponseBodyOperationList self = new DescribeInvadeEventDetailResponseBodyOperationList();
            return TeaModel.build(map, self);
        }

        public DescribeInvadeEventDetailResponseBodyOperationList setArgs(String args) {
            this.args = args;
            return this;
        }
        public String getArgs() {
            return this.args;
        }

        public DescribeInvadeEventDetailResponseBodyOperationList setOperate(String operate) {
            this.operate = operate;
            return this;
        }
        public String getOperate() {
            return this.operate;
        }

    }

    public static class DescribeInvadeEventDetailResponseBodyUnhandleOperationList extends TeaModel {
        /**
         * <p>The parameters for the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Args")
        public String args;

        /**
         * <p>The operation.</p>
         * 
         * <strong>example:</strong>
         * <p>RunMode</p>
         */
        @NameInMap("Operate")
        public String operate;

        public static DescribeInvadeEventDetailResponseBodyUnhandleOperationList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvadeEventDetailResponseBodyUnhandleOperationList self = new DescribeInvadeEventDetailResponseBodyUnhandleOperationList();
            return TeaModel.build(map, self);
        }

        public DescribeInvadeEventDetailResponseBodyUnhandleOperationList setArgs(String args) {
            this.args = args;
            return this;
        }
        public String getArgs() {
            return this.args;
        }

        public DescribeInvadeEventDetailResponseBodyUnhandleOperationList setOperate(String operate) {
            this.operate = operate;
            return this;
        }
        public String getOperate() {
            return this.operate;
        }

    }

}
