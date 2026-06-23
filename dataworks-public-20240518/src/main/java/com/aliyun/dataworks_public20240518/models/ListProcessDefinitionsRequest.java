// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListProcessDefinitionsRequest extends TeaModel {
    /**
     * <p>The type of the process definition. Valid values:</p>
     * <ul>
     * <li><p>MaxCompute</p>
     * </li>
     * <li><p>DataService</p>
     * </li>
     * <li><p>Extension</p>
     * </li>
     * <li><p>Hologres</p>
     * </li>
     * <li><p>EMR (You cannot create custom definitions for this type.)</p>
     * </li>
     * <li><p>DataAssetGovernance (You cannot create custom definitions for this type.)</p>
     * </li>
     * <li><p>Lindorm (You cannot create custom definitions for this type.)</p>
     * </li>
     * <li><p>DlfNext (You cannot create custom definitions for this type.)</p>
     * </li>
     * <li><p>DlfV1 (You cannot create custom definitions for this type.)</p>
     * </li>
     * <li><p>StarRocks (You cannot create custom definitions for this type.)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MaxCompute</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListProcessDefinitionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProcessDefinitionsRequest self = new ListProcessDefinitionsRequest();
        return TeaModel.build(map, self);
    }

    public ListProcessDefinitionsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
