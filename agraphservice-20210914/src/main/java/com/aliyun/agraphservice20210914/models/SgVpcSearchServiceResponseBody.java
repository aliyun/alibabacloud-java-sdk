// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agraphservice20210914.models;

import com.aliyun.tea.*;

public class SgVpcSearchServiceResponseBody extends TeaModel {
    // message
    @NameInMap("Message")
    public String message;

    // code
    @NameInMap("Code")
    public Integer code;

    // success
    @NameInMap("Success")
    public Boolean success;

    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    // data
    @NameInMap("Data")
    public SgVpcSearchServiceResponseBodyData data;

    public static SgVpcSearchServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SgVpcSearchServiceResponseBody self = new SgVpcSearchServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public SgVpcSearchServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SgVpcSearchServiceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SgVpcSearchServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SgVpcSearchServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SgVpcSearchServiceResponseBody setData(SgVpcSearchServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SgVpcSearchServiceResponseBodyData getData() {
        return this.data;
    }

    public static class SgVpcSearchServiceResponseBodyData extends TeaModel {
        // groupCnt
        @NameInMap("GroupCnt")
        public Long groupCnt;

        // centerId
        @NameInMap("CenterId")
        public String centerId;

        // groupInfo
        @NameInMap("GroupInfo")
        public java.util.List<String> groupInfo;

        // groupId
        @NameInMap("GroupId")
        public String groupId;

        // groupDetail
        @NameInMap("GroupDetail")
        public java.util.Map<String, String> groupDetail;

        public static SgVpcSearchServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SgVpcSearchServiceResponseBodyData self = new SgVpcSearchServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SgVpcSearchServiceResponseBodyData setGroupCnt(Long groupCnt) {
            this.groupCnt = groupCnt;
            return this;
        }
        public Long getGroupCnt() {
            return this.groupCnt;
        }

        public SgVpcSearchServiceResponseBodyData setCenterId(String centerId) {
            this.centerId = centerId;
            return this;
        }
        public String getCenterId() {
            return this.centerId;
        }

        public SgVpcSearchServiceResponseBodyData setGroupInfo(java.util.List<String> groupInfo) {
            this.groupInfo = groupInfo;
            return this;
        }
        public java.util.List<String> getGroupInfo() {
            return this.groupInfo;
        }

        public SgVpcSearchServiceResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public SgVpcSearchServiceResponseBodyData setGroupDetail(java.util.Map<String, String> groupDetail) {
            this.groupDetail = groupDetail;
            return this;
        }
        public java.util.Map<String, String> getGroupDetail() {
            return this.groupDetail;
        }

    }

}
