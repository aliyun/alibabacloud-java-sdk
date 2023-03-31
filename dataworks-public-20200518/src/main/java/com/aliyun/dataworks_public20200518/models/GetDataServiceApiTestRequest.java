// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataServiceApiTestRequest extends TeaModel {
    /**
     * <p>The ID of the test. You can obtain the test ID from the response of the asynchronous operation TestDataServiceApi. You can also call the ListDataServiceApiTest operation to obtain the ID of the latest test.</p>
     */
    @NameInMap("TestId")
    public Long testId;

    public static GetDataServiceApiTestRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceApiTestRequest self = new GetDataServiceApiTestRequest();
        return TeaModel.build(map, self);
    }

    public GetDataServiceApiTestRequest setTestId(Long testId) {
        this.testId = testId;
        return this;
    }
    public Long getTestId() {
        return this.testId;
    }

}
