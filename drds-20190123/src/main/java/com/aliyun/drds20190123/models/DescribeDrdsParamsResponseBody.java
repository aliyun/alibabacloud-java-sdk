// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsParamsResponseBody extends TeaModel {
    /**
     * <p>Indicates information about parameters.</p>
     */
    @NameInMap("List")
    public java.util.List<DescribeDrdsParamsResponseBodyList> list;

    /**
     * <p>Indicates the ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeDrdsParamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsParamsResponseBody self = new DescribeDrdsParamsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsParamsResponseBody setList(java.util.List<DescribeDrdsParamsResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeDrdsParamsResponseBodyList> getList() {
        return this.list;
    }

    public DescribeDrdsParamsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsParamsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDrdsParamsResponseBodyList extends TeaModel {
        /**
         * <p>Indicates the name of the database.</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>Indicates whether a restart is required.</p>
         */
        @NameInMap("NeedRestart")
        public Boolean needRestart;

        /**
         * <p>Indicates the default value of a parameter.</p>
         */
        @NameInMap("ParamDefaultValue")
        public String paramDefaultValue;

        /**
         * <p>Indicates the description of the parameter.</p>
         */
        @NameInMap("ParamDesc")
        public String paramDesc;

        /**
         * <p>Indicates the name of the parameter.</p>
         */
        @NameInMap("ParamEnglishName")
        public String paramEnglishName;

        /**
         * <p>Indicates the parameter level.</p>
         */
        @NameInMap("ParamLevel")
        public String paramLevel;

        /**
         * <p>Indicates the name of the parameter.</p>
         */
        @NameInMap("ParamName")
        public String paramName;

        /**
         * <p>Indicates the value range of the parameter.</p>
         */
        @NameInMap("ParamRanges")
        public String paramRanges;

        /**
         * <p>Indicates the type of the parameter.</p>
         */
        @NameInMap("ParamType")
        public String paramType;

        /**
         * <p>Indicates the value of the parameter.</p>
         */
        @NameInMap("ParamValue")
        public String paramValue;

        /**
         * <p>Indicates the name of the variable.</p>
         */
        @NameInMap("ParamVariableName")
        public String paramVariableName;

        public static DescribeDrdsParamsResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsParamsResponseBodyList self = new DescribeDrdsParamsResponseBodyList();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsParamsResponseBodyList setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeDrdsParamsResponseBodyList setNeedRestart(Boolean needRestart) {
            this.needRestart = needRestart;
            return this;
        }
        public Boolean getNeedRestart() {
            return this.needRestart;
        }

        public DescribeDrdsParamsResponseBodyList setParamDefaultValue(String paramDefaultValue) {
            this.paramDefaultValue = paramDefaultValue;
            return this;
        }
        public String getParamDefaultValue() {
            return this.paramDefaultValue;
        }

        public DescribeDrdsParamsResponseBodyList setParamDesc(String paramDesc) {
            this.paramDesc = paramDesc;
            return this;
        }
        public String getParamDesc() {
            return this.paramDesc;
        }

        public DescribeDrdsParamsResponseBodyList setParamEnglishName(String paramEnglishName) {
            this.paramEnglishName = paramEnglishName;
            return this;
        }
        public String getParamEnglishName() {
            return this.paramEnglishName;
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

        public DescribeDrdsParamsResponseBodyList setParamRanges(String paramRanges) {
            this.paramRanges = paramRanges;
            return this;
        }
        public String getParamRanges() {
            return this.paramRanges;
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

        public DescribeDrdsParamsResponseBodyList setParamVariableName(String paramVariableName) {
            this.paramVariableName = paramVariableName;
            return this;
        }
        public String getParamVariableName() {
            return this.paramVariableName;
        }

    }

}
