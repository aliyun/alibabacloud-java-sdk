// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeDisposeStrategyPlaybookResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeDisposeStrategyPlaybookResponseBodyData> data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeDisposeStrategyPlaybookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDisposeStrategyPlaybookResponseBody self = new DescribeDisposeStrategyPlaybookResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDisposeStrategyPlaybookResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeDisposeStrategyPlaybookResponseBody setData(java.util.List<DescribeDisposeStrategyPlaybookResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeDisposeStrategyPlaybookResponseBodyData> getData() {
        return this.data;
    }

    public DescribeDisposeStrategyPlaybookResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDisposeStrategyPlaybookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDisposeStrategyPlaybookResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDisposeStrategyPlaybookResponseBodyData extends TeaModel {
        /**
         * <p>The playbook name, which is the unique identifier of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>WafBlockIP</p>
         */
        @NameInMap("PlaybookName")
        public String playbookName;

        /**
         * <p>The UUID of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>system_aliyun_clb_process_book</p>
         */
        @NameInMap("PlaybookUuid")
        public String playbookUuid;

        public static DescribeDisposeStrategyPlaybookResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisposeStrategyPlaybookResponseBodyData self = new DescribeDisposeStrategyPlaybookResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDisposeStrategyPlaybookResponseBodyData setPlaybookName(String playbookName) {
            this.playbookName = playbookName;
            return this;
        }
        public String getPlaybookName() {
            return this.playbookName;
        }

        public DescribeDisposeStrategyPlaybookResponseBodyData setPlaybookUuid(String playbookUuid) {
            this.playbookUuid = playbookUuid;
            return this;
        }
        public String getPlaybookUuid() {
            return this.playbookUuid;
        }

    }

}
