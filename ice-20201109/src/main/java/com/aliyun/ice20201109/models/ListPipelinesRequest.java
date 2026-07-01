// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListPipelinesRequest extends TeaModel {
    /**
     * <p>The type of the MPS queue.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>Boost: MPS queue with transcoding speed boosted.</p>
     * </li>
     * <li><p>Standard: standard MPS queue.</p>
     * </li>
     * <li><p>NarrowBandHDV2: MPS queue that supports Narrowband HD 2.0.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("Speed")
    public String speed;

    public static ListPipelinesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPipelinesRequest self = new ListPipelinesRequest();
        return TeaModel.build(map, self);
    }

    public ListPipelinesRequest setSpeed(String speed) {
        this.speed = speed;
        return this;
    }
    public String getSpeed() {
        return this.speed;
    }

}
