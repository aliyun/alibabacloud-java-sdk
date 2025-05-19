// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class ListContactGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("ContactGroups")
    public ListContactGroupResponseBodyContactGroups contactGroups;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NextToken")
    public Integer nextToken;

    /**
     * <strong>example:</strong>
     * <p>D3D03B0A-CF1A-4DAB-BF0D-D4B6ACD5677A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListContactGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContactGroupResponseBody self = new ListContactGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContactGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListContactGroupResponseBody setContactGroups(ListContactGroupResponseBodyContactGroups contactGroups) {
        this.contactGroups = contactGroups;
        return this;
    }
    public ListContactGroupResponseBodyContactGroups getContactGroups() {
        return this.contactGroups;
    }

    public ListContactGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListContactGroupResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListContactGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListContactGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListContactGroupResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListContactGroupResponseBodyContactGroups extends TeaModel {
        @NameInMap("ContactGroup")
        public java.util.List<String> contactGroup;

        public static ListContactGroupResponseBodyContactGroups build(java.util.Map<String, ?> map) throws Exception {
            ListContactGroupResponseBodyContactGroups self = new ListContactGroupResponseBodyContactGroups();
            return TeaModel.build(map, self);
        }

        public ListContactGroupResponseBodyContactGroups setContactGroup(java.util.List<String> contactGroup) {
            this.contactGroup = contactGroup;
            return this;
        }
        public java.util.List<String> getContactGroup() {
            return this.contactGroup;
        }

    }

}
