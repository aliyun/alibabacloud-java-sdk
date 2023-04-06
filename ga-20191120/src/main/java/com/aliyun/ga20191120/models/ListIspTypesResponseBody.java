// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListIspTypesResponseBody extends TeaModel {
    /**
     * <p>The line types of EIPs in the acceleration region.</p>
     * <br>
     * <p>*   **BGP** (default): BGP (Multi-ISP) lines</p>
     * <p>*   **BGP_PRO**: BGP (Multi-ISP) Pro lines</p>
     * <br>
     * <p>If you have the permissions to use single-ISP bandwidth, one of the following values may be returned:</p>
     * <br>
     * <p>*   **ChinaTelecom**: China Telecom (single ISP)</p>
     * <p>*   **ChinaUnicom**: China Unicom (single ISP)</p>
     * <p>*   **ChinaMobile**: China Mobile (single ISP)</p>
     * <p>*   **ChinaTelecom_L2**: China Telecom_L2 (single ISP)</p>
     * <p>*   **ChinaUnicom_L2**: China Unicom_L2 (single ISP)</p>
     * <p>*   **ChinaMobile_L2**: China Mobile_L2 (single ISP)</p>
     * <br>
     * <p>> Different acceleration regions support different single-ISP BGP lines.</p>
     */
    @NameInMap("IspTypeList")
    public java.util.List<String> ispTypeList;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListIspTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIspTypesResponseBody self = new ListIspTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIspTypesResponseBody setIspTypeList(java.util.List<String> ispTypeList) {
        this.ispTypeList = ispTypeList;
        return this;
    }
    public java.util.List<String> getIspTypeList() {
        return this.ispTypeList;
    }

    public ListIspTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
