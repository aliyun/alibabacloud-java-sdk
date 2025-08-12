// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeUnhealthyHostAvailabilityResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <blockquote>
     * <p> The status code 200 indicates that the request was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>User not authorized to operate on the specified resource.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ACBDBB40-DFB6-4F4C-8957-51FFB233969C</p>
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

    /**
     * <p>The unhealthy instances that are detected by the specified availability monitoring tasks.</p>
     */
    @NameInMap("UnhealthyList")
    public DescribeUnhealthyHostAvailabilityResponseBodyUnhealthyList unhealthyList;

    public static DescribeUnhealthyHostAvailabilityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUnhealthyHostAvailabilityResponseBody self = new DescribeUnhealthyHostAvailabilityResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUnhealthyHostAvailabilityResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeUnhealthyHostAvailabilityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeUnhealthyHostAvailabilityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUnhealthyHostAvailabilityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeUnhealthyHostAvailabilityResponseBody setUnhealthyList(DescribeUnhealthyHostAvailabilityResponseBodyUnhealthyList unhealthyList) {
        this.unhealthyList = unhealthyList;
        return this;
    }
    public DescribeUnhealthyHostAvailabilityResponseBodyUnhealthyList getUnhealthyList() {
        return this.unhealthyList;
    }

    public static class DescribeUnhealthyHostAvailabilityResponseBodyUnhealthyListNodeTaskInstanceInstanceList extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static DescribeUnhealthyHostAvailabilityResponseBodyUnhealthyListNodeTaskInstanceInstanceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeUnhealthyHostAvailabilityResponseBodyUnhealthyListNodeTaskInstanceInstanceList self = new DescribeUnhealthyHostAvailabilityResponseBodyUnhealthyListNodeTaskInstanceInstanceList();
            return TeaModel.build(map, self);
        }

        public DescribeUnhealthyHostAvailabilityResponseBodyUnhealthyListNodeTaskInstanceInstanceList setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

    public static class DescribeUnhealthyHostAvailabilityResponseBodyUnhealthyListNodeTaskInstance extends TeaModel {
        /**
         * <p>The ID of the availability monitoring task.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceList")
        public DescribeUnhealthyHostAvailabilityResponseBodyUnhealthyListNodeTaskInstanceInstanceList instanceList;

        public static DescribeUnhealthyHostAvailabilityResponseBodyUnhealthyListNodeTaskInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeUnhealthyHostAvailabilityResponseBodyUnhealthyListNodeTaskInstance self = new DescribeUnhealthyHostAvailabilityResponseBodyUnhealthyListNodeTaskInstance();
            return TeaModel.build(map, self);
        }

        public DescribeUnhealthyHostAvailabilityResponseBodyUnhealthyListNodeTaskInstance setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeUnhealthyHostAvailabilityResponseBodyUnhealthyListNodeTaskInstance setInstanceList(DescribeUnhealthyHostAvailabilityResponseBodyUnhealthyListNodeTaskInstanceInstanceList instanceList) {
            this.instanceList = instanceList;
            return this;
        }
        public DescribeUnhealthyHostAvailabilityResponseBodyUnhealthyListNodeTaskInstanceInstanceList getInstanceList() {
            return this.instanceList;
        }

    }

    public static class DescribeUnhealthyHostAvailabilityResponseBodyUnhealthyList extends TeaModel {
        @NameInMap("NodeTaskInstance")
        public java.util.List<DescribeUnhealthyHostAvailabilityResponseBodyUnhealthyListNodeTaskInstance> nodeTaskInstance;

        public static DescribeUnhealthyHostAvailabilityResponseBodyUnhealthyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeUnhealthyHostAvailabilityResponseBodyUnhealthyList self = new DescribeUnhealthyHostAvailabilityResponseBodyUnhealthyList();
            return TeaModel.build(map, self);
        }

        public DescribeUnhealthyHostAvailabilityResponseBodyUnhealthyList setNodeTaskInstance(java.util.List<DescribeUnhealthyHostAvailabilityResponseBodyUnhealthyListNodeTaskInstance> nodeTaskInstance) {
            this.nodeTaskInstance = nodeTaskInstance;
            return this;
        }
        public java.util.List<DescribeUnhealthyHostAvailabilityResponseBodyUnhealthyListNodeTaskInstance> getNodeTaskInstance() {
            return this.nodeTaskInstance;
        }

    }

}
