// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetOptionValueForProjectResponseBody extends TeaModel {
    @NameInMap("OptionValue")
    public String optionValue;

    /**
     * <p>The option settings. In the example, cuNumber is a custom key.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetOptionValueForProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOptionValueForProjectResponseBody self = new GetOptionValueForProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOptionValueForProjectResponseBody setOptionValue(String optionValue) {
        this.optionValue = optionValue;
        return this;
    }
    public String getOptionValue() {
        return this.optionValue;
    }

    public GetOptionValueForProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
