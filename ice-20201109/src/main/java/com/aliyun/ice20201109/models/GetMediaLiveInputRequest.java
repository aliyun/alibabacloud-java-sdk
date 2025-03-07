// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaLiveInputRequest extends TeaModel {
    /**
     * <p>The ID of the input.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SEGK5KA6KYKAWQQH</p>
     */
    @NameInMap("InputId")
    public String inputId;

    public static GetMediaLiveInputRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMediaLiveInputRequest self = new GetMediaLiveInputRequest();
        return TeaModel.build(map, self);
    }

    public GetMediaLiveInputRequest setInputId(String inputId) {
        this.inputId = inputId;
        return this;
    }
    public String getInputId() {
        return this.inputId;
    }

}
