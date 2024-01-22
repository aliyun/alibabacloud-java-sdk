// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class LuggageDirectShrinkRequest extends TeaModel {
    @NameInMap("flight_segment_param_list")
    public String flightSegmentParamListShrink;

    public static LuggageDirectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        LuggageDirectShrinkRequest self = new LuggageDirectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public LuggageDirectShrinkRequest setFlightSegmentParamListShrink(String flightSegmentParamListShrink) {
        this.flightSegmentParamListShrink = flightSegmentParamListShrink;
        return this;
    }
    public String getFlightSegmentParamListShrink() {
        return this.flightSegmentParamListShrink;
    }

}
