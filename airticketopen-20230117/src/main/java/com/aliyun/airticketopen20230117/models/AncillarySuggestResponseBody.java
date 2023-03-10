// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class AncillarySuggestResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public AncillarySuggestResponseBodyData data;

    @NameInMap("error_code")
    public String errorCode;

    @NameInMap("error_data")
    public Object errorData;

    @NameInMap("error_msg")
    public String errorMsg;

    @NameInMap("status")
    public Integer status;

    @NameInMap("success")
    public Boolean success;

    public static AncillarySuggestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AncillarySuggestResponseBody self = new AncillarySuggestResponseBody();
        return TeaModel.build(map, self);
    }

    public AncillarySuggestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AncillarySuggestResponseBody setData(AncillarySuggestResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AncillarySuggestResponseBodyData getData() {
        return this.data;
    }

    public AncillarySuggestResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AncillarySuggestResponseBody setErrorData(Object errorData) {
        this.errorData = errorData;
        return this;
    }
    public Object getErrorData() {
        return this.errorData;
    }

    public AncillarySuggestResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public AncillarySuggestResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public AncillarySuggestResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AncillarySuggestResponseBodyDataSegAncillaryMapListAncillary extends TeaModel {
        @NameInMap("ancillary_id")
        public String ancillaryId;

        @NameInMap("ancillary_info")
        public java.util.Map<String, ?> ancillaryInfo;

        @NameInMap("ancillary_type")
        public Integer ancillaryType;

        public static AncillarySuggestResponseBodyDataSegAncillaryMapListAncillary build(java.util.Map<String, ?> map) throws Exception {
            AncillarySuggestResponseBodyDataSegAncillaryMapListAncillary self = new AncillarySuggestResponseBodyDataSegAncillaryMapListAncillary();
            return TeaModel.build(map, self);
        }

        public AncillarySuggestResponseBodyDataSegAncillaryMapListAncillary setAncillaryId(String ancillaryId) {
            this.ancillaryId = ancillaryId;
            return this;
        }
        public String getAncillaryId() {
            return this.ancillaryId;
        }

        public AncillarySuggestResponseBodyDataSegAncillaryMapListAncillary setAncillaryInfo(java.util.Map<String, ?> ancillaryInfo) {
            this.ancillaryInfo = ancillaryInfo;
            return this;
        }
        public java.util.Map<String, ?> getAncillaryInfo() {
            return this.ancillaryInfo;
        }

        public AncillarySuggestResponseBodyDataSegAncillaryMapListAncillary setAncillaryType(Integer ancillaryType) {
            this.ancillaryType = ancillaryType;
            return this;
        }
        public Integer getAncillaryType() {
            return this.ancillaryType;
        }

    }

    public static class AncillarySuggestResponseBodyDataSegAncillaryMapList extends TeaModel {
        @NameInMap("ancillary")
        public AncillarySuggestResponseBodyDataSegAncillaryMapListAncillary ancillary;

        @NameInMap("segment_id_list")
        public java.util.List<String> segmentIdList;

        public static AncillarySuggestResponseBodyDataSegAncillaryMapList build(java.util.Map<String, ?> map) throws Exception {
            AncillarySuggestResponseBodyDataSegAncillaryMapList self = new AncillarySuggestResponseBodyDataSegAncillaryMapList();
            return TeaModel.build(map, self);
        }

        public AncillarySuggestResponseBodyDataSegAncillaryMapList setAncillary(AncillarySuggestResponseBodyDataSegAncillaryMapListAncillary ancillary) {
            this.ancillary = ancillary;
            return this;
        }
        public AncillarySuggestResponseBodyDataSegAncillaryMapListAncillary getAncillary() {
            return this.ancillary;
        }

        public AncillarySuggestResponseBodyDataSegAncillaryMapList setSegmentIdList(java.util.List<String> segmentIdList) {
            this.segmentIdList = segmentIdList;
            return this;
        }
        public java.util.List<String> getSegmentIdList() {
            return this.segmentIdList;
        }

    }

    public static class AncillarySuggestResponseBodyData extends TeaModel {
        @NameInMap("seg_ancillary_map_list")
        public java.util.List<AncillarySuggestResponseBodyDataSegAncillaryMapList> segAncillaryMapList;

        @NameInMap("solution_id")
        public String solutionId;

        public static AncillarySuggestResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AncillarySuggestResponseBodyData self = new AncillarySuggestResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AncillarySuggestResponseBodyData setSegAncillaryMapList(java.util.List<AncillarySuggestResponseBodyDataSegAncillaryMapList> segAncillaryMapList) {
            this.segAncillaryMapList = segAncillaryMapList;
            return this;
        }
        public java.util.List<AncillarySuggestResponseBodyDataSegAncillaryMapList> getSegAncillaryMapList() {
            return this.segAncillaryMapList;
        }

        public AncillarySuggestResponseBodyData setSolutionId(String solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public String getSolutionId() {
            return this.solutionId;
        }

    }

}
