// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerAppResourceStatusResponseBody extends TeaModel {
    /**
     * <p>Queries the regions of deployment.</p>
     */
    @NameInMap("Regions")
    public java.util.List<GetEdgeContainerAppResourceStatusResponseBodyRegions> regions;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetEdgeContainerAppResourceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerAppResourceStatusResponseBody self = new GetEdgeContainerAppResourceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerAppResourceStatusResponseBody setRegions(java.util.List<GetEdgeContainerAppResourceStatusResponseBodyRegions> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<GetEdgeContainerAppResourceStatusResponseBodyRegions> getRegions() {
        return this.regions;
    }

    public GetEdgeContainerAppResourceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetEdgeContainerAppResourceStatusResponseBodyRegions extends TeaModel {
        /**
         * <p>Whether smooth offline is being used.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsOffline")
        public Boolean isOffline;

        /**
         * <p>Whether it is a test environment.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsStaging")
        public Boolean isStaging;

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
         * <p>The number of ready replicas.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Ready")
        public Integer ready;

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
         * <p>The number of replicas that are deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static GetEdgeContainerAppResourceStatusResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            GetEdgeContainerAppResourceStatusResponseBodyRegions self = new GetEdgeContainerAppResourceStatusResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public GetEdgeContainerAppResourceStatusResponseBodyRegions setIsOffline(Boolean isOffline) {
            this.isOffline = isOffline;
            return this;
        }
        public Boolean getIsOffline() {
            return this.isOffline;
        }

        public GetEdgeContainerAppResourceStatusResponseBodyRegions setIsStaging(Boolean isStaging) {
            this.isStaging = isStaging;
            return this;
        }
        public Boolean getIsStaging() {
            return this.isStaging;
        }

        public GetEdgeContainerAppResourceStatusResponseBodyRegions setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public GetEdgeContainerAppResourceStatusResponseBodyRegions setReady(Integer ready) {
            this.ready = ready;
            return this;
        }
        public Integer getReady() {
            return this.ready;
        }

        public GetEdgeContainerAppResourceStatusResponseBodyRegions setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetEdgeContainerAppResourceStatusResponseBodyRegions setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
