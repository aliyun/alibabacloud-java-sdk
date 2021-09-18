// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agraphservice20210914.models;

import com.aliyun.tea.*;

public class SearchSgVpcGraphServiceRequest extends TeaModel {
    // param0
    @NameInMap("Param0")
    public String param0;

    // param1
    @NameInMap("Param1")
    public String param1;

    // param2
    @NameInMap("Param2")
    public String param2;

    public static SearchSgVpcGraphServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchSgVpcGraphServiceRequest self = new SearchSgVpcGraphServiceRequest();
        return TeaModel.build(map, self);
    }

    public SearchSgVpcGraphServiceRequest setParam0(String param0) {
        this.param0 = param0;
        return this;
    }
    public String getParam0() {
        return this.param0;
    }

    public SearchSgVpcGraphServiceRequest setParam1(String param1) {
        this.param1 = param1;
        return this;
    }
    public String getParam1() {
        return this.param1;
    }

    public SearchSgVpcGraphServiceRequest setParam2(String param2) {
        this.param2 = param2;
        return this;
    }
    public String getParam2() {
        return this.param2;
    }

}
