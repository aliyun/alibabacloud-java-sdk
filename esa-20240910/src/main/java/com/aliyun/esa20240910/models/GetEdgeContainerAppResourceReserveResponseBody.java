// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerAppResourceReserveResponseBody extends TeaModel {
    /**
     * <p>The reservation expiration time. This parameter uses UTC time. To convert from UTC+8, add 8 hours. For example, if the current UTC+8 time is 2006-01-02 06:04:05, enter &quot;2006-01-02T14:04:05Z&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>2006-01-02T15:04:05Z</p>
     */
    @NameInMap("DurationTime")
    public String durationTime;

    /**
     * <p>Indicates whether resource reservation is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>Indicates whether the reservation is permanently enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Forever")
    public Boolean forever;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of reserved resources.</p>
     */
    @NameInMap("ReserveSet")
    public java.util.List<GetEdgeContainerAppResourceReserveResponseBodyReserveSet> reserveSet;

    public static GetEdgeContainerAppResourceReserveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerAppResourceReserveResponseBody self = new GetEdgeContainerAppResourceReserveResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerAppResourceReserveResponseBody setDurationTime(String durationTime) {
        this.durationTime = durationTime;
        return this;
    }
    public String getDurationTime() {
        return this.durationTime;
    }

    public GetEdgeContainerAppResourceReserveResponseBody setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public GetEdgeContainerAppResourceReserveResponseBody setForever(Boolean forever) {
        this.forever = forever;
        return this;
    }
    public Boolean getForever() {
        return this.forever;
    }

    public GetEdgeContainerAppResourceReserveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEdgeContainerAppResourceReserveResponseBody setReserveSet(java.util.List<GetEdgeContainerAppResourceReserveResponseBodyReserveSet> reserveSet) {
        this.reserveSet = reserveSet;
        return this;
    }
    public java.util.List<GetEdgeContainerAppResourceReserveResponseBodyReserveSet> getReserveSet() {
        return this.reserveSet;
    }

    public static class GetEdgeContainerAppResourceReserveResponseBodyReserveSet extends TeaModel {
        /**
         * <p>The following Internet service providers (ISPs) are supported. This parameter is not required for regions outside the Chinese mainland.
         * Valid values:</p>
         * <ul>
         * <li>cmcc: China Mobile</li>
         * <li>chinanet: China Telecom</li>
         * <li>unicom: China Unicom.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cmcc</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <p>The Chinese mainland:</p>
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

        public static GetEdgeContainerAppResourceReserveResponseBodyReserveSet build(java.util.Map<String, ?> map) throws Exception {
            GetEdgeContainerAppResourceReserveResponseBodyReserveSet self = new GetEdgeContainerAppResourceReserveResponseBodyReserveSet();
            return TeaModel.build(map, self);
        }

        public GetEdgeContainerAppResourceReserveResponseBodyReserveSet setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public GetEdgeContainerAppResourceReserveResponseBodyReserveSet setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetEdgeContainerAppResourceReserveResponseBodyReserveSet setReplicas(Integer replicas) {
            this.replicas = replicas;
            return this;
        }
        public Integer getReplicas() {
            return this.replicas;
        }

    }

}
