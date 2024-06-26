// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainInformationNewRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AntChainId")
    public String antChainId;

    @NameInMap("ConsortiumId")
    public String consortiumId;

    public static DescribeAntChainInformationNewRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainInformationNewRequest self = new DescribeAntChainInformationNewRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainInformationNewRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public DescribeAntChainInformationNewRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

}
