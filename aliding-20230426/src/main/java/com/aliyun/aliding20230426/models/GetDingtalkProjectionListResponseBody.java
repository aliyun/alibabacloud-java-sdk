// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDingtalkProjectionListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public java.util.List<GetDingtalkProjectionListResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("vendorType")
    public String vendorType;

    public static GetDingtalkProjectionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDingtalkProjectionListResponseBody self = new GetDingtalkProjectionListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDingtalkProjectionListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetDingtalkProjectionListResponseBody setData(java.util.List<GetDingtalkProjectionListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDingtalkProjectionListResponseBodyData> getData() {
        return this.data;
    }

    public GetDingtalkProjectionListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDingtalkProjectionListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public GetDingtalkProjectionListResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetDingtalkProjectionListResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class GetDingtalkProjectionListResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>IN</p>
         */
        @NameInMap("callStatus")
        public String callStatus;

        /**
         * <strong>example:</strong>
         * <p>ABCD</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>3424242</p>
         */
        @NameInMap("devUid")
        public Long devUid;

        /**
         * <strong>example:</strong>
         * <p>517169</p>
         */
        @NameInMap("duration")
        public String duration;

        /**
         * <strong>example:</strong>
         * <p>1757729705000</p>
         */
        @NameInMap("endTs")
        public Long endTs;

        /**
         * <strong>example:</strong>
         * <p>342456</p>
         */
        @NameInMap("nickCode")
        public String nickCode;

        /**
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("orgId")
        public Long orgId;

        /**
         * <strong>example:</strong>
         * <p>4234242</p>
         */
        @NameInMap("recvClientId")
        public String recvClientId;

        /**
         * <strong>example:</strong>
         * <p>web</p>
         */
        @NameInMap("recvClientName")
        public String recvClientName;

        /**
         * <strong>example:</strong>
         * <p>room001</p>
         */
        @NameInMap("sendClientId")
        public String sendClientId;

        /**
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("sendClientName")
        public String sendClientName;

        /**
         * <strong>example:</strong>
         * <p>24324</p>
         */
        @NameInMap("sendClientWorkNo")
        public String sendClientWorkNo;

        /**
         * <strong>example:</strong>
         * <p>1765502676356</p>
         */
        @NameInMap("startTs")
        public Long startTs;

        /**
         * <strong>example:</strong>
         * <p>2432424</p>
         */
        @NameInMap("timeStr")
        public String timeStr;

        public static GetDingtalkProjectionListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDingtalkProjectionListResponseBodyData self = new GetDingtalkProjectionListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDingtalkProjectionListResponseBodyData setCallStatus(String callStatus) {
            this.callStatus = callStatus;
            return this;
        }
        public String getCallStatus() {
            return this.callStatus;
        }

        public GetDingtalkProjectionListResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetDingtalkProjectionListResponseBodyData setDevUid(Long devUid) {
            this.devUid = devUid;
            return this;
        }
        public Long getDevUid() {
            return this.devUid;
        }

        public GetDingtalkProjectionListResponseBodyData setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetDingtalkProjectionListResponseBodyData setEndTs(Long endTs) {
            this.endTs = endTs;
            return this;
        }
        public Long getEndTs() {
            return this.endTs;
        }

        public GetDingtalkProjectionListResponseBodyData setNickCode(String nickCode) {
            this.nickCode = nickCode;
            return this;
        }
        public String getNickCode() {
            return this.nickCode;
        }

        public GetDingtalkProjectionListResponseBodyData setOrgId(Long orgId) {
            this.orgId = orgId;
            return this;
        }
        public Long getOrgId() {
            return this.orgId;
        }

        public GetDingtalkProjectionListResponseBodyData setRecvClientId(String recvClientId) {
            this.recvClientId = recvClientId;
            return this;
        }
        public String getRecvClientId() {
            return this.recvClientId;
        }

        public GetDingtalkProjectionListResponseBodyData setRecvClientName(String recvClientName) {
            this.recvClientName = recvClientName;
            return this;
        }
        public String getRecvClientName() {
            return this.recvClientName;
        }

        public GetDingtalkProjectionListResponseBodyData setSendClientId(String sendClientId) {
            this.sendClientId = sendClientId;
            return this;
        }
        public String getSendClientId() {
            return this.sendClientId;
        }

        public GetDingtalkProjectionListResponseBodyData setSendClientName(String sendClientName) {
            this.sendClientName = sendClientName;
            return this;
        }
        public String getSendClientName() {
            return this.sendClientName;
        }

        public GetDingtalkProjectionListResponseBodyData setSendClientWorkNo(String sendClientWorkNo) {
            this.sendClientWorkNo = sendClientWorkNo;
            return this;
        }
        public String getSendClientWorkNo() {
            return this.sendClientWorkNo;
        }

        public GetDingtalkProjectionListResponseBodyData setStartTs(Long startTs) {
            this.startTs = startTs;
            return this;
        }
        public Long getStartTs() {
            return this.startTs;
        }

        public GetDingtalkProjectionListResponseBodyData setTimeStr(String timeStr) {
            this.timeStr = timeStr;
            return this;
        }
        public String getTimeStr() {
            return this.timeStr;
        }

    }

}
