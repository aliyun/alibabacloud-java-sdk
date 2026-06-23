// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateEdgeContainerAppResourceReserveRequest extends TeaModel {
    /**
     * <p>The application ID. You can call the <a href="~~ListEdgeContainerApps~~">ListEdgeContainerApps</a> operation to obtain the application ID.</p>
     * <blockquote>
     * <p>Notice: The AppId format is the app- prefix followed by a numeric suffix, with a total length of 20 to 64 characters (example: app-8806886***83794688). Call ListEdgeContainerApps to obtain an existing AppId, or call CreateEdgeContainerApp to create an application first.</notice>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>app-88068867578379****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The reservation end time. This parameter uses UTC time. To convert from UTC+8, add 8 hours. For example, if the current time is 2006-01-02 06:04:05 in UTC+8, enter &quot;2006-01-02T14:04:05Z&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>2006-01-02T15:04:05Z</p>
     */
    @NameInMap("DurationTime")
    public String durationTime;

    /**
     * <p>Specifies whether to enable resource reservation.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>Specifies whether to permanently enable reservation. Once enabled, you cannot set a reservation end time.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Forever")
    public Boolean forever;

    /**
     * <p>The list of reserved resources.</p>
     */
    @NameInMap("ReserveSet")
    public java.util.List<UpdateEdgeContainerAppResourceReserveRequestReserveSet> reserveSet;

    public static UpdateEdgeContainerAppResourceReserveRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEdgeContainerAppResourceReserveRequest self = new UpdateEdgeContainerAppResourceReserveRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEdgeContainerAppResourceReserveRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateEdgeContainerAppResourceReserveRequest setDurationTime(String durationTime) {
        this.durationTime = durationTime;
        return this;
    }
    public String getDurationTime() {
        return this.durationTime;
    }

    public UpdateEdgeContainerAppResourceReserveRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateEdgeContainerAppResourceReserveRequest setForever(Boolean forever) {
        this.forever = forever;
        return this;
    }
    public Boolean getForever() {
        return this.forever;
    }

    public UpdateEdgeContainerAppResourceReserveRequest setReserveSet(java.util.List<UpdateEdgeContainerAppResourceReserveRequestReserveSet> reserveSet) {
        this.reserveSet = reserveSet;
        return this;
    }
    public java.util.List<UpdateEdgeContainerAppResourceReserveRequestReserveSet> getReserveSet() {
        return this.reserveSet;
    }

    public static class UpdateEdgeContainerAppResourceReserveRequestReserveSet extends TeaModel {
        /**
         * <p>The Internet service provider (ISP). The following ISPs are supported. You do not need to specify an ISP for special administrative regions or areas outside China:</p>
         * <ul>
         * <li>China Mobile: cmcc</li>
         * <li>China Telecom: chinanet</li>
         * <li>China Unicom: unicom.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cmcc</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <p>The region information. For the Chinese mainland, you can specify a major region. For special administrative regions and areas outside China, you can specify a country or region. The following list shows the parameter mappings:</p>
         * <p>Chinese mainland:</p>
         * <ul>
         * <li>East China: huadong</li>
         * <li>South China: huanan</li>
         * <li>Central China: huazhong</li>
         * <li>North China: huabei</li>
         * <li>Northwest China: xibei</li>
         * <li>Southwest China: xinan</li>
         * <li>Northeast China: dongbei</li>
         * </ul>
         * <p>Special administrative regions and outside China:</p>
         * <ul>
         * <li>Taiwan (China): tw</li>
         * <li>Macao (China): mo</li>
         * <li>Hong Kong (China): hk</li>
         * <li>Japan: jp</li>
         * <li>United States: us</li>
         * <li>Thailand: th</li>
         * <li>South Korea: kr</li>
         * <li>Russia: ru</li>
         * <li>Singapore: sg</li>
         * <li>France: fr</li>
         * <li>Spain: es</li>
         * <li>Italy: it</li>
         * <li>Sweden: se</li>
         * <li>United Arab Emirates: ae</li>
         * <li>Indonesia: id</li>
         * <li>Chile: cl</li>
         * <li>Philippines: ph</li>
         * <li>Malaysia: my</li>
         * <li>Vietnam: vn</li>
         * <li>Argentina: ar</li>
         * <li>Australia: au</li>
         * <li>Brazil: br</li>
         * <li>Colombia: co</li>
         * <li>Germany: de</li>
         * <li>United Kingdom: gb</li>
         * <li>Peru: pe</li>
         * <li>Saudi Arabia: sa</li>
         * <li>Netherlands: nl</li>
         * <li>South Africa: za.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>huazhong</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The number of container replicas.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Replicas")
        public Integer replicas;

        public static UpdateEdgeContainerAppResourceReserveRequestReserveSet build(java.util.Map<String, ?> map) throws Exception {
            UpdateEdgeContainerAppResourceReserveRequestReserveSet self = new UpdateEdgeContainerAppResourceReserveRequestReserveSet();
            return TeaModel.build(map, self);
        }

        public UpdateEdgeContainerAppResourceReserveRequestReserveSet setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public UpdateEdgeContainerAppResourceReserveRequestReserveSet setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public UpdateEdgeContainerAppResourceReserveRequestReserveSet setReplicas(Integer replicas) {
            this.replicas = replicas;
            return this;
        }
        public Integer getReplicas() {
            return this.replicas;
        }

    }

}
