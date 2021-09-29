// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ExecuteCameraShootingCommandResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ShootingRecord")
    public ExecuteCameraShootingCommandResponseBodyShootingRecord shootingRecord;

    public static ExecuteCameraShootingCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteCameraShootingCommandResponseBody self = new ExecuteCameraShootingCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteCameraShootingCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteCameraShootingCommandResponseBody setShootingRecord(ExecuteCameraShootingCommandResponseBodyShootingRecord shootingRecord) {
        this.shootingRecord = shootingRecord;
        return this;
    }
    public ExecuteCameraShootingCommandResponseBodyShootingRecord getShootingRecord() {
        return this.shootingRecord;
    }

    public static class ExecuteCameraShootingCommandResponseBodyShootingRecord extends TeaModel {
        // 主键ID
        @NameInMap("Id")
        public Long id;

        // 拍摄类型，0-图片，1-视频
        @NameInMap("ShootingType")
        public Long shootingType;

        // 拍摄数量
        @NameInMap("Number")
        public Long number;

        // 拍照间隔/视频时长，单位为s
        @NameInMap("Time")
        public Long time;

        // 记录时间
        @NameInMap("RecordTime")
        public Long recordTime;

        // 状态：0-未完成，1-已完成
        @NameInMap("Status")
        public Long status;

        public static ExecuteCameraShootingCommandResponseBodyShootingRecord build(java.util.Map<String, ?> map) throws Exception {
            ExecuteCameraShootingCommandResponseBodyShootingRecord self = new ExecuteCameraShootingCommandResponseBodyShootingRecord();
            return TeaModel.build(map, self);
        }

        public ExecuteCameraShootingCommandResponseBodyShootingRecord setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExecuteCameraShootingCommandResponseBodyShootingRecord setShootingType(Long shootingType) {
            this.shootingType = shootingType;
            return this;
        }
        public Long getShootingType() {
            return this.shootingType;
        }

        public ExecuteCameraShootingCommandResponseBodyShootingRecord setNumber(Long number) {
            this.number = number;
            return this;
        }
        public Long getNumber() {
            return this.number;
        }

        public ExecuteCameraShootingCommandResponseBodyShootingRecord setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public ExecuteCameraShootingCommandResponseBodyShootingRecord setRecordTime(Long recordTime) {
            this.recordTime = recordTime;
            return this;
        }
        public Long getRecordTime() {
            return this.recordTime;
        }

        public ExecuteCameraShootingCommandResponseBodyShootingRecord setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

}
