// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class EticketInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("availableNum")
    public Long availableNum;

    /**
     * <strong>example:</strong>
     * <p>taobao******tpg</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("codeStatus")
    public Long codeStatus;

    /**
     * <strong>example:</strong>
     * <p>2026-08-02T23:59:59.000+08:00</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("lockNum")
    public Long lockNum;

    /**
     * <strong>example:</strong>
     * <p><a href="http://qrcode.alicdn.com/img.jpg">http://qrcode.alicdn.com/img.jpg</a></p>
     */
    @NameInMap("qrcodeUrl")
    public String qrcodeUrl;

    /**
     * <strong>example:</strong>
     * <p>2026-02-04T00:00:00.000+08:00</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>2026-02-04T15:07:59.000+08:00</p>
     */
    @NameInMap("useTime")
    public String useTime;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("usedNum")
    public Long usedNum;

    public static EticketInfo build(java.util.Map<String, ?> map) throws Exception {
        EticketInfo self = new EticketInfo();
        return TeaModel.build(map, self);
    }

    public EticketInfo setAvailableNum(Long availableNum) {
        this.availableNum = availableNum;
        return this;
    }
    public Long getAvailableNum() {
        return this.availableNum;
    }

    public EticketInfo setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EticketInfo setCodeStatus(Long codeStatus) {
        this.codeStatus = codeStatus;
        return this;
    }
    public Long getCodeStatus() {
        return this.codeStatus;
    }

    public EticketInfo setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public EticketInfo setLockNum(Long lockNum) {
        this.lockNum = lockNum;
        return this;
    }
    public Long getLockNum() {
        return this.lockNum;
    }

    public EticketInfo setQrcodeUrl(String qrcodeUrl) {
        this.qrcodeUrl = qrcodeUrl;
        return this;
    }
    public String getQrcodeUrl() {
        return this.qrcodeUrl;
    }

    public EticketInfo setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public EticketInfo setUseTime(String useTime) {
        this.useTime = useTime;
        return this;
    }
    public String getUseTime() {
        return this.useTime;
    }

    public EticketInfo setUsedNum(Long usedNum) {
        this.usedNum = usedNum;
        return this;
    }
    public Long getUsedNum() {
        return this.usedNum;
    }

}
