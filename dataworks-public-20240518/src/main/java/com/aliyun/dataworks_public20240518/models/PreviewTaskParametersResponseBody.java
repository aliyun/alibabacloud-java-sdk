// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class PreviewTaskParametersResponseBody extends TeaModel {
    /**
     * <p>The parameter preview results for each cycle.</p>
     */
    @NameInMap("Items")
    public java.util.List<PreviewTaskParametersResponseBodyItems> items;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PreviewTaskParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreviewTaskParametersResponseBody self = new PreviewTaskParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public PreviewTaskParametersResponseBody setItems(java.util.List<PreviewTaskParametersResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<PreviewTaskParametersResponseBodyItems> getItems() {
        return this.items;
    }

    public PreviewTaskParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PreviewTaskParametersResponseBodyItems extends TeaModel {
        /**
         * <p>The business date of the cycle. The value is a 13-digit UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1792425600000</p>
         */
        @NameInMap("Bizdate")
        public Long bizdate;

        /**
         * <p>The error message returned when the parsing for the cycle fails. This parameter is returned when Success is false and is not returned when Success is true.</p>
         * 
         * <strong>example:</strong>
         * <p>Failed to parse scheduling parameters. Check the parameter settings.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The complete script parameter string parsed for the cycle. Multiple parameters are separated by spaces. This parameter is returned when Success is true.</p>
         * 
         * <strong>example:</strong>
         * <p>para1=20261020 para2=00</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        /**
         * <p>Specifies whether the scheduling parameters for the cycle are parsed successfully. Valid values:</p>
         * <ul>
         * <li>true: The parsing is successful.</li>
         * <li>false: The parsing fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        /**
         * <p>The simulated scheduled trigger time. The value is a 13-digit UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1792512000000</p>
         */
        @NameInMap("TriggerTime")
        public Long triggerTime;

        public static PreviewTaskParametersResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            PreviewTaskParametersResponseBodyItems self = new PreviewTaskParametersResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public PreviewTaskParametersResponseBodyItems setBizdate(Long bizdate) {
            this.bizdate = bizdate;
            return this;
        }
        public Long getBizdate() {
            return this.bizdate;
        }

        public PreviewTaskParametersResponseBodyItems setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public PreviewTaskParametersResponseBodyItems setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public PreviewTaskParametersResponseBodyItems setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public PreviewTaskParametersResponseBodyItems setTriggerTime(Long triggerTime) {
            this.triggerTime = triggerTime;
            return this;
        }
        public Long getTriggerTime() {
            return this.triggerTime;
        }

    }

}
