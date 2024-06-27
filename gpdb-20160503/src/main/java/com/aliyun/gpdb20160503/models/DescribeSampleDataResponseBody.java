// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSampleDataResponseBody extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp12ga6v69h86****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The error message returned if an error occurs. This message does not affect the execution of the operation.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Indicates whether a sample dataset is loaded to the instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: A sample dataset is loaded.</li>
     * <li><strong>false</strong>: No sample dataset is loaded.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasSampleData")
    public Boolean hasSampleData;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>84CD7CAF-FA7B-5178-B19F-D8CDE307D5FA_8111</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The loading status of the sample dataset. Valid values:</p>
     * <ul>
     * <li><strong>loaded</strong></li>
     * <li><strong>loading</strong></li>
     * <li><strong>unload</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>loaded</p>
     */
    @NameInMap("SampleDataStatus")
    public String sampleDataStatus;

    public static DescribeSampleDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleDataResponseBody self = new DescribeSampleDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSampleDataResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeSampleDataResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeSampleDataResponseBody setHasSampleData(Boolean hasSampleData) {
        this.hasSampleData = hasSampleData;
        return this;
    }
    public Boolean getHasSampleData() {
        return this.hasSampleData;
    }

    public DescribeSampleDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSampleDataResponseBody setSampleDataStatus(String sampleDataStatus) {
        this.sampleDataStatus = sampleDataStatus;
        return this;
    }
    public String getSampleDataStatus() {
        return this.sampleDataStatus;
    }

}
