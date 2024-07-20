// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListIspTypesResponseBody extends TeaModel {
    /**
     * <p>The line types of EIPs in the acceleration region.</p>
     * <ul>
     * <li><strong>BGP</strong> (default): BGP (Multi-ISP) lines</li>
     * <li><strong>BGP_PRO</strong>: BGP (Multi-ISP) Pro lines</li>
     * </ul>
     * <p>If you have the permissions to use single-ISP bandwidth, one of the following values may be returned:</p>
     * <ul>
     * <li><strong>ChinaTelecom</strong>: China Telecom (single ISP)</li>
     * <li><strong>ChinaUnicom</strong>: China Unicom (single ISP)</li>
     * <li><strong>ChinaMobile</strong>: China Mobile (single ISP)</li>
     * <li><strong>ChinaTelecom_L2</strong>: China Telecom_L2 (single ISP)</li>
     * <li><strong>ChinaUnicom_L2</strong>: China Unicom_L2 (single ISP)</li>
     * <li><strong>ChinaMobile_L2</strong>: China Mobile_L2 (single ISP)</li>
     * </ul>
     * <blockquote>
     * <p>Different acceleration regions support different single-ISP BGP lines.</p>
     * </blockquote>
     */
    @NameInMap("IspTypeList")
    public java.util.List<String> ispTypeList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F591955F-5CB5-4CCE-A75D-17CF2085CE22</p>
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
