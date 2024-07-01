// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateSparkTemplateResponseBody extends TeaModel {
    /**
     * <p>The creation result.</p>
     */
    @NameInMap("Data")
    public CreateSparkTemplateResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSparkTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSparkTemplateResponseBody self = new CreateSparkTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSparkTemplateResponseBody setData(CreateSparkTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateSparkTemplateResponseBodyData getData() {
        return this.data;
    }

    public CreateSparkTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateSparkTemplateResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the application template is created. Valid values:</p>
         * <ul>
         * <li><strong>True</strong></li>
         * <li><strong>False</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Succeeded")
        public Boolean succeeded;

        public static CreateSparkTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateSparkTemplateResponseBodyData self = new CreateSparkTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateSparkTemplateResponseBodyData setSucceeded(Boolean succeeded) {
            this.succeeded = succeeded;
            return this;
        }
        public Boolean getSucceeded() {
            return this.succeeded;
        }

    }

}
