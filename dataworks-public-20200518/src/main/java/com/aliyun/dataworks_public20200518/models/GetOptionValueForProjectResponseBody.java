// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetOptionValueForProjectResponseBody extends TeaModel {
    /**
     * <p>The data returned In the example, cuNumber is a custom key.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;cuNumber&quot;:&quot;0&quot;}</p>
     */
    @NameInMap("OptionValue")
    public String optionValue;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E6F0DBDD-5AD****</p>
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
