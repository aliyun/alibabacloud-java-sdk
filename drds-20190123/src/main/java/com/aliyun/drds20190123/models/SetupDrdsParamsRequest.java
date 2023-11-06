// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SetupDrdsParamsRequest extends TeaModel {
    @NameInMap("Data")
    public java.util.List<SetupDrdsParamsRequestData> data;

    /**
     * <p>The ID of the PolarDB-X 1.0 instance for which you want to configure parameters.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The resource for which you want to configure parameters. Valid values:</p>
     * <br>
     * <p>*   **INSTANCE**: Configure parameters for the instance.</p>
     * <p>*   **DB**: Configure parameters for the databases of the instance.</p>
     */
    @NameInMap("ParamLevel")
    public String paramLevel;

    /**
     * <p>The ID of the region in which the PolarDB-X 1.0 instance is located.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static SetupDrdsParamsRequest build(java.util.Map<String, ?> map) throws Exception {
        SetupDrdsParamsRequest self = new SetupDrdsParamsRequest();
        return TeaModel.build(map, self);
    }

    public SetupDrdsParamsRequest setData(java.util.List<SetupDrdsParamsRequestData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SetupDrdsParamsRequestData> getData() {
        return this.data;
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

    public SetupDrdsParamsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class SetupDrdsParamsRequestData extends TeaModel {
        /**
         * <p>The name of the parameter that you want to configure for a database.</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>The valid values of the parameter.</p>
         */
        @NameInMap("ParamRanges")
        public String paramRanges;

        /**
         * <p>The type of the parameter that you want to configure. Valid values:</p>
         * <br>
         * <p>*   **ATOM**: the configuration item in the layer-3 data source.</p>
         * <p>*   **CONFIG**: the configuration item in ConfigServer.</p>
         * <p>*   **DIAMOND**: the configuration item in Diamond.</p>
         */
        @NameInMap("ParamType")
        public String paramType;

        /**
         * <p>The value of parameter that you want to configure.</p>
         */
        @NameInMap("ParamValue")
        public String paramValue;

        /**
         * <p>The name of the parameter that you want to configure.</p>
         */
        @NameInMap("ParamVariableName")
        public String paramVariableName;

        public static SetupDrdsParamsRequestData build(java.util.Map<String, ?> map) throws Exception {
            SetupDrdsParamsRequestData self = new SetupDrdsParamsRequestData();
            return TeaModel.build(map, self);
        }

        public SetupDrdsParamsRequestData setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public SetupDrdsParamsRequestData setParamRanges(String paramRanges) {
            this.paramRanges = paramRanges;
            return this;
        }
        public String getParamRanges() {
            return this.paramRanges;
        }

        public SetupDrdsParamsRequestData setParamType(String paramType) {
            this.paramType = paramType;
            return this;
        }
        public String getParamType() {
            return this.paramType;
        }

        public SetupDrdsParamsRequestData setParamValue(String paramValue) {
            this.paramValue = paramValue;
            return this;
        }
        public String getParamValue() {
            return this.paramValue;
        }

        public SetupDrdsParamsRequestData setParamVariableName(String paramVariableName) {
            this.paramVariableName = paramVariableName;
            return this;
        }
        public String getParamVariableName() {
            return this.paramVariableName;
        }

    }

}
