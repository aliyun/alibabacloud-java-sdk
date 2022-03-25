// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimStandardSampleResponseBody extends TeaModel {
    // 接口返回数据
    @NameInMap("Datas")
    public GetBimStandardSampleResponseBodyDatas datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetBimStandardSampleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBimStandardSampleResponseBody self = new GetBimStandardSampleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBimStandardSampleResponseBody setDatas(GetBimStandardSampleResponseBodyDatas datas) {
        this.datas = datas;
        return this;
    }
    public GetBimStandardSampleResponseBodyDatas getDatas() {
        return this.datas;
    }

    public GetBimStandardSampleResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public GetBimStandardSampleResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetBimStandardSampleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBimStandardSampleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBimStandardSampleResponseBodyDatasDataLegends extends TeaModel {
        // 底标高
        @NameInMap("ElevationHeight")
        public java.util.Map<String, ?> elevationHeight;

        // 标高模式
        @NameInMap("ElevationMode")
        public String elevationMode;

        // 标高运算
        @NameInMap("ElevationOperator")
        public String elevationOperator;

        // 板名
        @NameInMap("PatternName")
        public String patternName;

        // 板图片
        @NameInMap("Picture")
        public String picture;

        // 板厚度
        @NameInMap("Thickness")
        public Long thickness;

        public static GetBimStandardSampleResponseBodyDatasDataLegends build(java.util.Map<String, ?> map) throws Exception {
            GetBimStandardSampleResponseBodyDatasDataLegends self = new GetBimStandardSampleResponseBodyDatasDataLegends();
            return TeaModel.build(map, self);
        }

        public GetBimStandardSampleResponseBodyDatasDataLegends setElevationHeight(java.util.Map<String, ?> elevationHeight) {
            this.elevationHeight = elevationHeight;
            return this;
        }
        public java.util.Map<String, ?> getElevationHeight() {
            return this.elevationHeight;
        }

        public GetBimStandardSampleResponseBodyDatasDataLegends setElevationMode(String elevationMode) {
            this.elevationMode = elevationMode;
            return this;
        }
        public String getElevationMode() {
            return this.elevationMode;
        }

        public GetBimStandardSampleResponseBodyDatasDataLegends setElevationOperator(String elevationOperator) {
            this.elevationOperator = elevationOperator;
            return this;
        }
        public String getElevationOperator() {
            return this.elevationOperator;
        }

        public GetBimStandardSampleResponseBodyDatasDataLegends setPatternName(String patternName) {
            this.patternName = patternName;
            return this;
        }
        public String getPatternName() {
            return this.patternName;
        }

        public GetBimStandardSampleResponseBodyDatasDataLegends setPicture(String picture) {
            this.picture = picture;
            return this;
        }
        public String getPicture() {
            return this.picture;
        }

        public GetBimStandardSampleResponseBodyDatasDataLegends setThickness(Long thickness) {
            this.thickness = thickness;
            return this;
        }
        public Long getThickness() {
            return this.thickness;
        }

    }

    public static class GetBimStandardSampleResponseBodyDatasData extends TeaModel {
        @NameInMap("Legends")
        public java.util.List<GetBimStandardSampleResponseBodyDatasDataLegends> legends;

        // 根文件夹
        @NameInMap("RootDir")
        public String rootDir;

        // 默认厚度
        @NameInMap("Thickness")
        public Long thickness;

        public static GetBimStandardSampleResponseBodyDatasData build(java.util.Map<String, ?> map) throws Exception {
            GetBimStandardSampleResponseBodyDatasData self = new GetBimStandardSampleResponseBodyDatasData();
            return TeaModel.build(map, self);
        }

        public GetBimStandardSampleResponseBodyDatasData setLegends(java.util.List<GetBimStandardSampleResponseBodyDatasDataLegends> legends) {
            this.legends = legends;
            return this;
        }
        public java.util.List<GetBimStandardSampleResponseBodyDatasDataLegends> getLegends() {
            return this.legends;
        }

        public GetBimStandardSampleResponseBodyDatasData setRootDir(String rootDir) {
            this.rootDir = rootDir;
            return this;
        }
        public String getRootDir() {
            return this.rootDir;
        }

        public GetBimStandardSampleResponseBodyDatasData setThickness(Long thickness) {
            this.thickness = thickness;
            return this;
        }
        public Long getThickness() {
            return this.thickness;
        }

    }

    public static class GetBimStandardSampleResponseBodyDatas extends TeaModel {
        // 大样结构板数据
        @NameInMap("Data")
        public GetBimStandardSampleResponseBodyDatasData data;

        // 标准图纸id
        @NameInMap("Id")
        public Long id;

        // 图纸状态
        @NameInMap("Status")
        public Long status;

        public static GetBimStandardSampleResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            GetBimStandardSampleResponseBodyDatas self = new GetBimStandardSampleResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public GetBimStandardSampleResponseBodyDatas setData(GetBimStandardSampleResponseBodyDatasData data) {
            this.data = data;
            return this;
        }
        public GetBimStandardSampleResponseBodyDatasData getData() {
            return this.data;
        }

        public GetBimStandardSampleResponseBodyDatas setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetBimStandardSampleResponseBodyDatas setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

}
