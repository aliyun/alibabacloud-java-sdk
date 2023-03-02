// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class DescribeMPCoSAuthorizedInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DescribeMPCoSAuthorizedInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeMPCoSAuthorizedInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMPCoSAuthorizedInfoResponseBody self = new DescribeMPCoSAuthorizedInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMPCoSAuthorizedInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeMPCoSAuthorizedInfoResponseBody setData(DescribeMPCoSAuthorizedInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeMPCoSAuthorizedInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeMPCoSAuthorizedInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMPCoSAuthorizedInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMPCoSAuthorizedInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeMPCoSAuthorizedInfoResponseBodyDataAuthorizedPhaseList extends TeaModel {
        @NameInMap("PhaseId")
        public String phaseId;

        @NameInMap("PhaseName")
        public String phaseName;

        public static DescribeMPCoSAuthorizedInfoResponseBodyDataAuthorizedPhaseList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMPCoSAuthorizedInfoResponseBodyDataAuthorizedPhaseList self = new DescribeMPCoSAuthorizedInfoResponseBodyDataAuthorizedPhaseList();
            return TeaModel.build(map, self);
        }

        public DescribeMPCoSAuthorizedInfoResponseBodyDataAuthorizedPhaseList setPhaseId(String phaseId) {
            this.phaseId = phaseId;
            return this;
        }
        public String getPhaseId() {
            return this.phaseId;
        }

        public DescribeMPCoSAuthorizedInfoResponseBodyDataAuthorizedPhaseList setPhaseName(String phaseName) {
            this.phaseName = phaseName;
            return this;
        }
        public String getPhaseName() {
            return this.phaseName;
        }

    }

    public static class DescribeMPCoSAuthorizedInfoResponseBodyDataUnAuthorizedPhaseList extends TeaModel {
        @NameInMap("PhaseId")
        public String phaseId;

        @NameInMap("PhaseName")
        public String phaseName;

        public static DescribeMPCoSAuthorizedInfoResponseBodyDataUnAuthorizedPhaseList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMPCoSAuthorizedInfoResponseBodyDataUnAuthorizedPhaseList self = new DescribeMPCoSAuthorizedInfoResponseBodyDataUnAuthorizedPhaseList();
            return TeaModel.build(map, self);
        }

        public DescribeMPCoSAuthorizedInfoResponseBodyDataUnAuthorizedPhaseList setPhaseId(String phaseId) {
            this.phaseId = phaseId;
            return this;
        }
        public String getPhaseId() {
            return this.phaseId;
        }

        public DescribeMPCoSAuthorizedInfoResponseBodyDataUnAuthorizedPhaseList setPhaseName(String phaseName) {
            this.phaseName = phaseName;
            return this;
        }
        public String getPhaseName() {
            return this.phaseName;
        }

    }

    public static class DescribeMPCoSAuthorizedInfoResponseBodyData extends TeaModel {
        @NameInMap("AuthorizedPhaseList")
        public java.util.List<DescribeMPCoSAuthorizedInfoResponseBodyDataAuthorizedPhaseList> authorizedPhaseList;

        @NameInMap("UnAuthorizedPhaseList")
        public java.util.List<DescribeMPCoSAuthorizedInfoResponseBodyDataUnAuthorizedPhaseList> unAuthorizedPhaseList;

        public static DescribeMPCoSAuthorizedInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMPCoSAuthorizedInfoResponseBodyData self = new DescribeMPCoSAuthorizedInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMPCoSAuthorizedInfoResponseBodyData setAuthorizedPhaseList(java.util.List<DescribeMPCoSAuthorizedInfoResponseBodyDataAuthorizedPhaseList> authorizedPhaseList) {
            this.authorizedPhaseList = authorizedPhaseList;
            return this;
        }
        public java.util.List<DescribeMPCoSAuthorizedInfoResponseBodyDataAuthorizedPhaseList> getAuthorizedPhaseList() {
            return this.authorizedPhaseList;
        }

        public DescribeMPCoSAuthorizedInfoResponseBodyData setUnAuthorizedPhaseList(java.util.List<DescribeMPCoSAuthorizedInfoResponseBodyDataUnAuthorizedPhaseList> unAuthorizedPhaseList) {
            this.unAuthorizedPhaseList = unAuthorizedPhaseList;
            return this;
        }
        public java.util.List<DescribeMPCoSAuthorizedInfoResponseBodyDataUnAuthorizedPhaseList> getUnAuthorizedPhaseList() {
            return this.unAuthorizedPhaseList;
        }

    }

}
