// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class CreateEssOptJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("ElecPrice")
    public java.util.List<CreateEssOptJobRequestElecPrice> elecPrice;

    /**
     * <strong>example:</strong>
     * <p>FIFTEEN_MIN</p>
     */
    @NameInMap("Freq")
    public String freq;

    @NameInMap("GenPrice")
    public java.util.List<CreateEssOptJobRequestGenPrice> genPrice;

    @NameInMap("Location")
    public CreateEssOptJobRequestLocation location;

    /**
     * <strong>example:</strong>
     * <p>latest</p>
     */
    @NameInMap("ModelVersion")
    public String modelVersion;

    /**
     * <strong>example:</strong>
     * <p>2025-02-12</p>
     */
    @NameInMap("RunDate")
    public String runDate;

    @NameInMap("SystemData")
    public java.util.List<CreateEssOptJobRequestSystemData> systemData;

    /**
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("TimeZone")
    public String timeZone;

    /**
     * <strong>example:</strong>
     * <p>LOAD_ESS_SOLAR</p>
     */
    @NameInMap("TopoType")
    public String topoType;

    public static CreateEssOptJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEssOptJobRequest self = new CreateEssOptJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateEssOptJobRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreateEssOptJobRequest setElecPrice(java.util.List<CreateEssOptJobRequestElecPrice> elecPrice) {
        this.elecPrice = elecPrice;
        return this;
    }
    public java.util.List<CreateEssOptJobRequestElecPrice> getElecPrice() {
        return this.elecPrice;
    }

    public CreateEssOptJobRequest setFreq(String freq) {
        this.freq = freq;
        return this;
    }
    public String getFreq() {
        return this.freq;
    }

    public CreateEssOptJobRequest setGenPrice(java.util.List<CreateEssOptJobRequestGenPrice> genPrice) {
        this.genPrice = genPrice;
        return this;
    }
    public java.util.List<CreateEssOptJobRequestGenPrice> getGenPrice() {
        return this.genPrice;
    }

    public CreateEssOptJobRequest setLocation(CreateEssOptJobRequestLocation location) {
        this.location = location;
        return this;
    }
    public CreateEssOptJobRequestLocation getLocation() {
        return this.location;
    }

    public CreateEssOptJobRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public CreateEssOptJobRequest setRunDate(String runDate) {
        this.runDate = runDate;
        return this;
    }
    public String getRunDate() {
        return this.runDate;
    }

    public CreateEssOptJobRequest setSystemData(java.util.List<CreateEssOptJobRequestSystemData> systemData) {
        this.systemData = systemData;
        return this;
    }
    public java.util.List<CreateEssOptJobRequestSystemData> getSystemData() {
        return this.systemData;
    }

    public CreateEssOptJobRequest setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public CreateEssOptJobRequest setTopoType(String topoType) {
        this.topoType = topoType;
        return this;
    }
    public String getTopoType() {
        return this.topoType;
    }

    public static class CreateEssOptJobRequestElecPrice extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>00:00:15</p>
         */
        @NameInMap("DataTime")
        public String dataTime;

        /**
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Price")
        public String price;

        public static CreateEssOptJobRequestElecPrice build(java.util.Map<String, ?> map) throws Exception {
            CreateEssOptJobRequestElecPrice self = new CreateEssOptJobRequestElecPrice();
            return TeaModel.build(map, self);
        }

        public CreateEssOptJobRequestElecPrice setDataTime(String dataTime) {
            this.dataTime = dataTime;
            return this;
        }
        public String getDataTime() {
            return this.dataTime;
        }

        public CreateEssOptJobRequestElecPrice setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

    }

    public static class CreateEssOptJobRequestGenPrice extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>00:00:15</p>
         */
        @NameInMap("DataTime")
        public String dataTime;

        /**
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("Price")
        public String price;

        public static CreateEssOptJobRequestGenPrice build(java.util.Map<String, ?> map) throws Exception {
            CreateEssOptJobRequestGenPrice self = new CreateEssOptJobRequestGenPrice();
            return TeaModel.build(map, self);
        }

        public CreateEssOptJobRequestGenPrice setDataTime(String dataTime) {
            this.dataTime = dataTime;
            return this;
        }
        public String getDataTime() {
            return this.dataTime;
        }

        public CreateEssOptJobRequestGenPrice setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

    }

    public static class CreateEssOptJobRequestLocation extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10.123</p>
         */
        @NameInMap("Altitude")
        public Double altitude;

        /**
         * <strong>example:</strong>
         * <p>40.027</p>
         */
        @NameInMap("Latitude")
        public Double latitude;

        /**
         * <strong>example:</strong>
         * <p>120.042</p>
         */
        @NameInMap("Longitude")
        public Double longitude;

        public static CreateEssOptJobRequestLocation build(java.util.Map<String, ?> map) throws Exception {
            CreateEssOptJobRequestLocation self = new CreateEssOptJobRequestLocation();
            return TeaModel.build(map, self);
        }

        public CreateEssOptJobRequestLocation setAltitude(Double altitude) {
            this.altitude = altitude;
            return this;
        }
        public Double getAltitude() {
            return this.altitude;
        }

        public CreateEssOptJobRequestLocation setLatitude(Double latitude) {
            this.latitude = latitude;
            return this;
        }
        public Double getLatitude() {
            return this.latitude;
        }

        public CreateEssOptJobRequestLocation setLongitude(Double longitude) {
            this.longitude = longitude;
            return this;
        }
        public Double getLongitude() {
            return this.longitude;
        }

    }

    public static class CreateEssOptJobRequestSystemData extends TeaModel {
        @NameInMap("HistoryData")
        public java.util.List<java.util.Map<String, ?>> historyData;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SystemId")
        public String systemId;

        @NameInMap("SystemParams")
        public java.util.Map<String, ?> systemParams;

        /**
         * <strong>example:</strong>
         * <p>ess</p>
         */
        @NameInMap("SystemType")
        public String systemType;

        public static CreateEssOptJobRequestSystemData build(java.util.Map<String, ?> map) throws Exception {
            CreateEssOptJobRequestSystemData self = new CreateEssOptJobRequestSystemData();
            return TeaModel.build(map, self);
        }

        public CreateEssOptJobRequestSystemData setHistoryData(java.util.List<java.util.Map<String, ?>> historyData) {
            this.historyData = historyData;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getHistoryData() {
            return this.historyData;
        }

        public CreateEssOptJobRequestSystemData setSystemId(String systemId) {
            this.systemId = systemId;
            return this;
        }
        public String getSystemId() {
            return this.systemId;
        }

        public CreateEssOptJobRequestSystemData setSystemParams(java.util.Map<String, ?> systemParams) {
            this.systemParams = systemParams;
            return this;
        }
        public java.util.Map<String, ?> getSystemParams() {
            return this.systemParams;
        }

        public CreateEssOptJobRequestSystemData setSystemType(String systemType) {
            this.systemType = systemType;
            return this;
        }
        public String getSystemType() {
            return this.systemType;
        }

    }

}
