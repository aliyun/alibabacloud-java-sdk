// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateEdgeContainerAppResourceReserveRequest extends TeaModel {
    /**
     * <p>The application ID, which can be obtained by calling the <a href="~~ListEdgeContainerApps~~">ListEdgeContainerApps</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>app-88068867578379****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The end time of the reservation. The input time is UTC. It takes +8 hours to enter Beijing time. For example, if the current time is 2006-01-02 06:04:05, you need to enter &quot;2006-01-02T14:04:05Z&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>2006-01-02T15:04:05Z</p>
     */
    @NameInMap("DurationTime")
    public String durationTime;

    /**
     * <p>Whether to enable resource reservation.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>Whether to permanently enable the reservation. Once it is enabled, you are not allowed to set the reservation deadline.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Forever")
    public Boolean forever;

    /**
     * <p>Reserved resource list.</p>
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
         * <p>The ISP. The following types are supported. You do not need to enter the ISP in regions outside the Chinese mainland:</p>
         * <ul>
         * <li>China Mobile: cmcc</li>
         * <li>China Telecom: chinanet</li>
         * <li>China Unicom: unicom</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cmcc</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <p>Information about the region. The Chinese mainland supports the input of regions and special administrative regions, and the regions outside the Chinese mainland support the input of countries. The following is the corresponding parameter mapping:</p>
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
         * <p>Special Administrative Regions and overseas:</p>
         * <ul>
         * <li>Taiwan, China: tw</li>
         * <li>Macau, China: mo</li>
         * <li>Hong Kong, China: hk</li>
         * <li>Japan: jp</li>
         * <li>United States: us</li>
         * <li>Thailand: th</li>
         * <li>Korea: kr</li>
         * <li>Russia: ru</li>
         * <li>Singapore: sg</li>
         * <li>France: fr</li>
         * <li>Spain: es</li>
         * <li>Italy: it</li>
         * <li>Sweden: se</li>
         * <li>UAE: ae</li>
         * <li>Indonesia: id</li>
         * <li>Chile: cl</li>
         * <li>Philippines: ph</li>
         * <li>Malaysia: my</li>
         * <li>Vietnam: vn</li>
         * <li>Argentina: AR</li>
         * <li>Australia: au</li>
         * <li>Brazil: br</li>
         * <li>Colombia: co</li>
         * <li>Germany: de</li>
         * <li>UK: GB</li>
         * <li>Peru: pe</li>
         * <li>Saudi Arabia: sa</li>
         * <li>Netherlands: nl</li>
         * <li>South Africa: za</li>
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
