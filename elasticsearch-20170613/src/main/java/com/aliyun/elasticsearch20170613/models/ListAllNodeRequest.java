// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListAllNodeRequest extends TeaModel {
    /**
     * <p>Specifies whether to return monitoring information for the nodes. Valid values:</p>
     * <ul>
     * <li><p>true (default): Returns monitoring information.</p>
     * </li>
     * <li><p>false: Does not return monitoring information.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("extended")
    public Boolean extended;

    public static ListAllNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAllNodeRequest self = new ListAllNodeRequest();
        return TeaModel.build(map, self);
    }

    public ListAllNodeRequest setExtended(Boolean extended) {
        this.extended = extended;
        return this;
    }
    public Boolean getExtended() {
        return this.extended;
    }

}
