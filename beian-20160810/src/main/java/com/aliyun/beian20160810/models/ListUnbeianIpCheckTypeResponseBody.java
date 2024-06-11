// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.beian20160810.models;

import com.aliyun.tea.*;

public class ListUnbeianIpCheckTypeResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HuntressIpCheckTypeResultDO")
    public ListUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDO huntressIpCheckTypeResultDO;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListUnbeianIpCheckTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUnbeianIpCheckTypeResponseBody self = new ListUnbeianIpCheckTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUnbeianIpCheckTypeResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public ListUnbeianIpCheckTypeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListUnbeianIpCheckTypeResponseBody setHuntressIpCheckTypeResultDO(ListUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDO huntressIpCheckTypeResultDO) {
        this.huntressIpCheckTypeResultDO = huntressIpCheckTypeResultDO;
        return this;
    }
    public ListUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDO getHuntressIpCheckTypeResultDO() {
        return this.huntressIpCheckTypeResultDO;
    }

    public ListUnbeianIpCheckTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUnbeianIpCheckTypeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDOList extends TeaModel {
        @NameInMap("Aliuid")
        public Long aliuid;

        @NameInMap("Caller")
        public String caller;

        @NameInMap("CheckType")
        public Integer checkType;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Remark")
        public String remark;

        public static ListUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDOList build(java.util.Map<String, ?> map) throws Exception {
            ListUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDOList self = new ListUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDOList();
            return TeaModel.build(map, self);
        }

        public ListUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDOList setAliuid(Long aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public Long getAliuid() {
            return this.aliuid;
        }

        public ListUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDOList setCaller(String caller) {
            this.caller = caller;
            return this;
        }
        public String getCaller() {
            return this.caller;
        }

        public ListUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDOList setCheckType(Integer checkType) {
            this.checkType = checkType;
            return this;
        }
        public Integer getCheckType() {
            return this.checkType;
        }

        public ListUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDOList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDOList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

    public static class ListUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDO extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDOList> list;

        @NameInMap("Msg")
        public String msg;

        @NameInMap("Success")
        public Boolean success;

        public static ListUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDO build(java.util.Map<String, ?> map) throws Exception {
            ListUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDO self = new ListUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDO();
            return TeaModel.build(map, self);
        }

        public ListUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDO setList(java.util.List<ListUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDOList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDOList> getList() {
            return this.list;
        }

        public ListUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDO setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public ListUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDO setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
