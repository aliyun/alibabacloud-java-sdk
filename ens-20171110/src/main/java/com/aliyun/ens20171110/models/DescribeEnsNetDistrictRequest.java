// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsNetDistrictRequest extends TeaModel {
    /**
     * <p>The region code.</p>
     * <p>If this parameter is left empty, only the edge zones under the specified NetLevelCode are queried.</p>
     * <p>If this parameter is specified, only the child edge zones under the specified NetDistrictCode are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>100106</p>
     */
    @NameInMap("NetDistrictCode")
    public String netDistrictCode;

    /**
     * <p>The region code.</p>
     */
    @NameInMap("NetDistrictCodeNode")
    public Boolean netDistrictCodeNode;

    /**
     * <p>The region level. Valid values:</p>
     * <ul>
     * <li><p><strong>Big</strong>: Area.</p>
     * </li>
     * <li><p><strong>Middle</strong>: Province.</p>
     * </li>
     * <li><p><strong>Small</strong>: City.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Big</p>
     */
    @NameInMap("NetLevelCode")
    public String netLevelCode;

    public static DescribeEnsNetDistrictRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsNetDistrictRequest self = new DescribeEnsNetDistrictRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEnsNetDistrictRequest setNetDistrictCode(String netDistrictCode) {
        this.netDistrictCode = netDistrictCode;
        return this;
    }
    public String getNetDistrictCode() {
        return this.netDistrictCode;
    }

    public DescribeEnsNetDistrictRequest setNetDistrictCodeNode(Boolean netDistrictCodeNode) {
        this.netDistrictCodeNode = netDistrictCodeNode;
        return this;
    }
    public Boolean getNetDistrictCodeNode() {
        return this.netDistrictCodeNode;
    }

    public DescribeEnsNetDistrictRequest setNetLevelCode(String netLevelCode) {
        this.netLevelCode = netLevelCode;
        return this;
    }
    public String getNetLevelCode() {
        return this.netLevelCode;
    }

}
