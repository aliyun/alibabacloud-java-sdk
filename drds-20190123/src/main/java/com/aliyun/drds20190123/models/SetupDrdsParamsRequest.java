// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SetupDrdsParamsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("ParamLevel")
    @Validation(required = true)
    public String paramLevel;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<SetupDrdsParamsRequestData> data;

    public static SetupDrdsParamsRequest build(java.util.Map<String, ?> map) throws Exception {
        SetupDrdsParamsRequest self = new SetupDrdsParamsRequest();
        return TeaModel.build(map, self);
    }

    public SetupDrdsParamsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetupDrdsParamsRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public SetupDrdsParamsRequest setParamLevel(String paramLevel) {
        this.paramLevel = paramLevel;
        return this;
    }
    public String getParamLevel() {
        return this.paramLevel;
    }

    public SetupDrdsParamsRequest setData(java.util.List<SetupDrdsParamsRequestData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SetupDrdsParamsRequestData> getData() {
        return this.data;
    }

    public static class SetupDrdsParamsRequestData extends TeaModel {
        @NameInMap("ParamVariableName")
        public String paramVariableName;

        @NameInMap("ParamValue")
        public String paramValue;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("ParamType")
        public String paramType;

        @NameInMap("ParamRanges")
        public String paramRanges;

        public static SetupDrdsParamsRequestData build(java.util.Map<String, ?> map) throws Exception {
            SetupDrdsParamsRequestData self = new SetupDrdsParamsRequestData();
            return TeaModel.build(map, self);
        }

        public SetupDrdsParamsRequestData setParamVariableName(String paramVariableName) {
            this.paramVariableName = paramVariableName;
            return this;
        }
        public String getParamVariableName() {
            return this.paramVariableName;
        }

        public SetupDrdsParamsRequestData setParamValue(String paramValue) {
            this.paramValue = paramValue;
            return this;
        }
        public String getParamValue() {
            return this.paramValue;
        }

        public SetupDrdsParamsRequestData setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public SetupDrdsParamsRequestData setParamType(String paramType) {
            this.paramType = paramType;
            return this;
        }
        public String getParamType() {
            return this.paramType;
        }

        public SetupDrdsParamsRequestData setParamRanges(String paramRanges) {
            this.paramRanges = paramRanges;
            return this;
        }
        public String getParamRanges() {
            return this.paramRanges;
        }

    }

}
