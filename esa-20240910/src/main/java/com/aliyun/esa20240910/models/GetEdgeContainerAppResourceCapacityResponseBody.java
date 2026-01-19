// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerAppResourceCapacityResponseBody extends TeaModel {
    /**
     * <p>The queried region.</p>
     */
    @NameInMap("Regions")
    public java.util.List<GetEdgeContainerAppResourceCapacityResponseBodyRegions> regions;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>50423A7F-A83D-1E24-B80E-86DD25790759</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetEdgeContainerAppResourceCapacityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerAppResourceCapacityResponseBody self = new GetEdgeContainerAppResourceCapacityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerAppResourceCapacityResponseBody setRegions(java.util.List<GetEdgeContainerAppResourceCapacityResponseBodyRegions> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<GetEdgeContainerAppResourceCapacityResponseBodyRegions> getRegions() {
        return this.regions;
    }

    public GetEdgeContainerAppResourceCapacityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetEdgeContainerAppResourceCapacityResponseBodyRegions extends TeaModel {
        /**
         * <p>Supported ISPs are as follows. The parameter is left empty for regions outside the Chinese mainland. ISP:</p>
         * <ul>
         * <li>China Mobile: cmcc</li>
         * <li>China Telecom: chinanet</li>
         * <li>China Unicom: unicom</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>unicom</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
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
         * <p>Special Administrative Regions and Overseas:</p>
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
         * <p>huadong</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The number of container replicas that can be deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("Replicas")
        public Integer replicas;

        public static GetEdgeContainerAppResourceCapacityResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            GetEdgeContainerAppResourceCapacityResponseBodyRegions self = new GetEdgeContainerAppResourceCapacityResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public GetEdgeContainerAppResourceCapacityResponseBodyRegions setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public GetEdgeContainerAppResourceCapacityResponseBodyRegions setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetEdgeContainerAppResourceCapacityResponseBodyRegions setReplicas(Integer replicas) {
            this.replicas = replicas;
            return this;
        }
        public Integer getReplicas() {
            return this.replicas;
        }

    }

}
