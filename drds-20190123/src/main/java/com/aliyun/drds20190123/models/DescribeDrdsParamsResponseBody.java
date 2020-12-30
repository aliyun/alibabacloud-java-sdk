// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsParamsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("List")
    public java.util.List<DescribeDrdsParamsResponseBodyList> list;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDrdsParamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsParamsResponseBody self = new DescribeDrdsParamsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsParamsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsParamsResponseBody setList(java.util.List<DescribeDrdsParamsResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeDrdsParamsResponseBodyList> getList() {
        return this.list;
    }

    public DescribeDrdsParamsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDrdsParamsResponseBodyList extends TeaModel {
        @NameInMap("ParamDefaultValue")
        public String paramDefaultValue;

        @NameInMap("ParamLevel")
        public String paramLevel;

        @NameInMap("ParamName")
        public String paramName;

        @NameInMap("ParamType")
        public String paramType;

        @NameInMap("ParamValue")
        public String paramValue;

        @NameInMap("NeedRestart")
        public Boolean needRestart;

        @NameInMap("ParamRanges")
        public String paramRanges;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("ParamEnglishName")
        public String paramEnglishName;

        @NameInMap("ParamDesc")
        public String paramDesc;

        @NameInMap("ParamVariableName")
        public String paramVariableName;

        public static DescribeDrdsParamsResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsParamsResponseBodyList self = new DescribeDrdsParamsResponseBodyList();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsParamsResponseBodyList setParamDefaultValue(String paramDefaultValue) {
            this.paramDefaultValue = paramDefaultValue;
            return this;
        }
        public String getParamDefaultValue() {
            return this.paramDefaultValue;
        }

        public DescribeDrdsParamsResponseBodyList setParamLevel(String paramLevel) {
            this.paramLevel = paramLevel;
            return this;
        }
        public String getParamLevel() {
            return this.paramLevel;
        }

        public DescribeDrdsParamsResponseBodyList setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public DescribeDrdsParamsResponseBodyList setParamType(String paramType) {
            this.paramType = paramType;
            return this;
        }
        public String getParamType() {
            return this.paramType;
        }

        public DescribeDrdsParamsResponseBodyList setParamValue(String paramValue) {
            this.paramValue = paramValue;
            return this;
        }
        public String getParamValue() {
            return this.paramValue;
        }

        public DescribeDrdsParamsResponseBodyList setNeedRestart(Boolean needRestart) {
            this.needRestart = needRestart;
            return this;
        }
        public Boolean getNeedRestart() {
            return this.needRestart;
        }

        public DescribeDrdsParamsResponseBodyList setParamRanges(String paramRanges) {
            this.paramRanges = paramRanges;
            return this;
        }
        public String getParamRanges() {
            return this.paramRanges;
        }

        public DescribeDrdsParamsResponseBodyList setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeDrdsParamsResponseBodyList setParamEnglishName(String paramEnglishName) {
            this.paramEnglishName = paramEnglishName;
            return this;
        }
        public String getParamEnglishName() {
            return this.paramEnglishName;
        }

        public DescribeDrdsParamsResponseBodyList setParamDesc(String paramDesc) {
            this.paramDesc = paramDesc;
            return this;
        }
        public String getParamDesc() {
            return this.paramDesc;
        }

        public DescribeDrdsParamsResponseBodyList setParamVariableName(String paramVariableName) {
            this.paramVariableName = paramVariableName;
            return this;
        }
        public String getParamVariableName() {
            return this.paramVariableName;
        }

    }

}
