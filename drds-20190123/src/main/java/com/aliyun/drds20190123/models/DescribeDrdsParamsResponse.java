// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsParamsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("List")
    @Validation(required = true)
    public java.util.List<DescribeDrdsParamsResponseList> list;

    public static DescribeDrdsParamsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsParamsResponse self = new DescribeDrdsParamsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsParamsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsParamsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDrdsParamsResponse setList(java.util.List<DescribeDrdsParamsResponseList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeDrdsParamsResponseList> getList() {
        return this.list;
    }

    public static class DescribeDrdsParamsResponseList extends TeaModel {
        @NameInMap("ParamName")
        @Validation(required = true)
        public String paramName;

        @NameInMap("ParamEnglishName")
        @Validation(required = true)
        public String paramEnglishName;

        @NameInMap("ParamVariableName")
        @Validation(required = true)
        public String paramVariableName;

        @NameInMap("ParamDesc")
        @Validation(required = true)
        public String paramDesc;

        @NameInMap("ParamValue")
        @Validation(required = true)
        public String paramValue;

        @NameInMap("DbName")
        @Validation(required = true)
        public String dbName;

        @NameInMap("ParamDefaultValue")
        @Validation(required = true)
        public String paramDefaultValue;

        @NameInMap("ParamRanges")
        @Validation(required = true)
        public String paramRanges;

        @NameInMap("ParamLevel")
        @Validation(required = true)
        public String paramLevel;

        @NameInMap("ParamType")
        @Validation(required = true)
        public String paramType;

        @NameInMap("NeedRestart")
        @Validation(required = true)
        public Boolean needRestart;

        @NameInMap("UserVisible")
        @Validation(required = true)
        public Boolean userVisible;

        public static DescribeDrdsParamsResponseList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsParamsResponseList self = new DescribeDrdsParamsResponseList();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsParamsResponseList setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public DescribeDrdsParamsResponseList setParamEnglishName(String paramEnglishName) {
            this.paramEnglishName = paramEnglishName;
            return this;
        }
        public String getParamEnglishName() {
            return this.paramEnglishName;
        }

        public DescribeDrdsParamsResponseList setParamVariableName(String paramVariableName) {
            this.paramVariableName = paramVariableName;
            return this;
        }
        public String getParamVariableName() {
            return this.paramVariableName;
        }

        public DescribeDrdsParamsResponseList setParamDesc(String paramDesc) {
            this.paramDesc = paramDesc;
            return this;
        }
        public String getParamDesc() {
            return this.paramDesc;
        }

        public DescribeDrdsParamsResponseList setParamValue(String paramValue) {
            this.paramValue = paramValue;
            return this;
        }
        public String getParamValue() {
            return this.paramValue;
        }

        public DescribeDrdsParamsResponseList setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeDrdsParamsResponseList setParamDefaultValue(String paramDefaultValue) {
            this.paramDefaultValue = paramDefaultValue;
            return this;
        }
        public String getParamDefaultValue() {
            return this.paramDefaultValue;
        }

        public DescribeDrdsParamsResponseList setParamRanges(String paramRanges) {
            this.paramRanges = paramRanges;
            return this;
        }
        public String getParamRanges() {
            return this.paramRanges;
        }

        public DescribeDrdsParamsResponseList setParamLevel(String paramLevel) {
            this.paramLevel = paramLevel;
            return this;
        }
        public String getParamLevel() {
            return this.paramLevel;
        }

        public DescribeDrdsParamsResponseList setParamType(String paramType) {
            this.paramType = paramType;
            return this;
        }
        public String getParamType() {
            return this.paramType;
        }

        public DescribeDrdsParamsResponseList setNeedRestart(Boolean needRestart) {
            this.needRestart = needRestart;
            return this;
        }
        public Boolean getNeedRestart() {
            return this.needRestart;
        }

        public DescribeDrdsParamsResponseList setUserVisible(Boolean userVisible) {
            this.userVisible = userVisible;
            return this;
        }
        public Boolean getUserVisible() {
            return this.userVisible;
        }

    }

}
