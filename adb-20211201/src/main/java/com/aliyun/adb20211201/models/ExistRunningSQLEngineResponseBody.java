// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ExistRunningSQLEngineResponseBody extends TeaModel {
    /**
     * <p>Indicates whether a running SQL engine exists in the resource group.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>True</strong></li>
     * <li><strong>False</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FA675D68-14A4-5D9C-8820-92537D9F447E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExistRunningSQLEngineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExistRunningSQLEngineResponseBody self = new ExistRunningSQLEngineResponseBody();
        return TeaModel.build(map, self);
    }

    public ExistRunningSQLEngineResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public ExistRunningSQLEngineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
