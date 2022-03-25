// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimStandardListResponseBody extends TeaModel {
    @NameInMap("Datas")
    public java.util.List<GetBimStandardListResponseBodyDatas> datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetBimStandardListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBimStandardListResponseBody self = new GetBimStandardListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBimStandardListResponseBody setDatas(java.util.List<GetBimStandardListResponseBodyDatas> datas) {
        this.datas = datas;
        return this;
    }
    public java.util.List<GetBimStandardListResponseBodyDatas> getDatas() {
        return this.datas;
    }

    public GetBimStandardListResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public GetBimStandardListResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetBimStandardListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBimStandardListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBimStandardListResponseBodyDatasArchitecture extends TeaModel {
        @NameInMap("Detail")
        public java.util.List<java.util.Map<String, ?>> detail;

        @NameInMap("Elevation")
        public java.util.List<java.util.Map<String, ?>> elevation;

        @NameInMap("Plan")
        public java.util.List<java.util.Map<String, ?>> plan;

        public static GetBimStandardListResponseBodyDatasArchitecture build(java.util.Map<String, ?> map) throws Exception {
            GetBimStandardListResponseBodyDatasArchitecture self = new GetBimStandardListResponseBodyDatasArchitecture();
            return TeaModel.build(map, self);
        }

        public GetBimStandardListResponseBodyDatasArchitecture setDetail(java.util.List<java.util.Map<String, ?>> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getDetail() {
            return this.detail;
        }

        public GetBimStandardListResponseBodyDatasArchitecture setElevation(java.util.List<java.util.Map<String, ?>> elevation) {
            this.elevation = elevation;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getElevation() {
            return this.elevation;
        }

        public GetBimStandardListResponseBodyDatasArchitecture setPlan(java.util.List<java.util.Map<String, ?>> plan) {
            this.plan = plan;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getPlan() {
            return this.plan;
        }

    }

    public static class GetBimStandardListResponseBodyDatasStructure extends TeaModel {
        @NameInMap("Detail")
        public java.util.List<java.util.Map<String, ?>> detail;

        @NameInMap("Elevation")
        public java.util.List<java.util.Map<String, ?>> elevation;

        @NameInMap("Plan")
        public java.util.List<java.util.Map<String, ?>> plan;

        @NameInMap("Sample")
        public java.util.List<java.util.Map<String, ?>> sample;

        public static GetBimStandardListResponseBodyDatasStructure build(java.util.Map<String, ?> map) throws Exception {
            GetBimStandardListResponseBodyDatasStructure self = new GetBimStandardListResponseBodyDatasStructure();
            return TeaModel.build(map, self);
        }

        public GetBimStandardListResponseBodyDatasStructure setDetail(java.util.List<java.util.Map<String, ?>> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getDetail() {
            return this.detail;
        }

        public GetBimStandardListResponseBodyDatasStructure setElevation(java.util.List<java.util.Map<String, ?>> elevation) {
            this.elevation = elevation;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getElevation() {
            return this.elevation;
        }

        public GetBimStandardListResponseBodyDatasStructure setPlan(java.util.List<java.util.Map<String, ?>> plan) {
            this.plan = plan;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getPlan() {
            return this.plan;
        }

        public GetBimStandardListResponseBodyDatasStructure setSample(java.util.List<java.util.Map<String, ?>> sample) {
            this.sample = sample;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getSample() {
            return this.sample;
        }

    }

    public static class GetBimStandardListResponseBodyDatas extends TeaModel {
        @NameInMap("Architecture")
        public GetBimStandardListResponseBodyDatasArchitecture architecture;

        @NameInMap("BuildingNo")
        public String buildingNo;

        @NameInMap("Structure")
        public GetBimStandardListResponseBodyDatasStructure structure;

        public static GetBimStandardListResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            GetBimStandardListResponseBodyDatas self = new GetBimStandardListResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public GetBimStandardListResponseBodyDatas setArchitecture(GetBimStandardListResponseBodyDatasArchitecture architecture) {
            this.architecture = architecture;
            return this;
        }
        public GetBimStandardListResponseBodyDatasArchitecture getArchitecture() {
            return this.architecture;
        }

        public GetBimStandardListResponseBodyDatas setBuildingNo(String buildingNo) {
            this.buildingNo = buildingNo;
            return this;
        }
        public String getBuildingNo() {
            return this.buildingNo;
        }

        public GetBimStandardListResponseBodyDatas setStructure(GetBimStandardListResponseBodyDatasStructure structure) {
            this.structure = structure;
            return this;
        }
        public GetBimStandardListResponseBodyDatasStructure getStructure() {
            return this.structure;
        }

    }

}
