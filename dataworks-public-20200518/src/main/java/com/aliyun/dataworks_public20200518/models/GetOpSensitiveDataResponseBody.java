// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetOpSensitiveDataResponseBody extends TeaModel {
    /**
     * <p>The information about the access records of the sensitive data. The information includes totalCount and opRiskDatas. opRiskDatas includes the following parameters:</p>
     * <ul>
     * <li>sensType: the type of the sensitive data.</li>
     * <li>sensLevel: the sensitivity level of the sensitive data. A larger value indicates a higher sensitivity level.</li>
     * <li>opType: the type of the operation.</li>
     * <li>sql: the SQL statement that is executed.</li>
     * <li>opAccount: the account that is used to perform the operation.</li>
     * <li>opTime: the time when the operation was performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;opSensDatas&quot;: [       {         &quot;sensLevel&quot;: &quot;L4&quot;,         &quot;opTime&quot;: &quot;2021-02-07 00:14:51&quot;,         &quot;opAccount&quot;: &quot;ALIYUN$dsg_test&quot;,         &quot;sensType&quot;: &quot;Mobile phone number&quot;,         &quot;sql&quot;: &quot;select * from dsg_demo.tbl_phonebook where phone_no = &#39;1331111****&#39;;&quot;       }     ],     &quot;totalCount&quot;: 6</p>
     */
    @NameInMap("OpSensitiveData")
    public String opSensitiveData;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetOpSensitiveDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOpSensitiveDataResponseBody self = new GetOpSensitiveDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOpSensitiveDataResponseBody setOpSensitiveData(String opSensitiveData) {
        this.opSensitiveData = opSensitiveData;
        return this;
    }
    public String getOpSensitiveData() {
        return this.opSensitiveData;
    }

    public GetOpSensitiveDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
