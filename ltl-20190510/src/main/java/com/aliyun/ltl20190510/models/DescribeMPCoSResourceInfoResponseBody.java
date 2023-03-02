// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class DescribeMPCoSResourceInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DescribeMPCoSResourceInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeMPCoSResourceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMPCoSResourceInfoResponseBody self = new DescribeMPCoSResourceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMPCoSResourceInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeMPCoSResourceInfoResponseBody setData(DescribeMPCoSResourceInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeMPCoSResourceInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeMPCoSResourceInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMPCoSResourceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMPCoSResourceInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeMPCoSResourceInfoResponseBodyDataPhaseQuotaInfoList extends TeaModel {
        @NameInMap("PhaseGroupId")
        public String phaseGroupId;

        @NameInMap("PhaseGroupName")
        public String phaseGroupName;

        @NameInMap("PhaseQuota")
        public Long phaseQuota;

        @NameInMap("UsedPhase")
        public Long usedPhase;

        public static DescribeMPCoSResourceInfoResponseBodyDataPhaseQuotaInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMPCoSResourceInfoResponseBodyDataPhaseQuotaInfoList self = new DescribeMPCoSResourceInfoResponseBodyDataPhaseQuotaInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeMPCoSResourceInfoResponseBodyDataPhaseQuotaInfoList setPhaseGroupId(String phaseGroupId) {
            this.phaseGroupId = phaseGroupId;
            return this;
        }
        public String getPhaseGroupId() {
            return this.phaseGroupId;
        }

        public DescribeMPCoSResourceInfoResponseBodyDataPhaseQuotaInfoList setPhaseGroupName(String phaseGroupName) {
            this.phaseGroupName = phaseGroupName;
            return this;
        }
        public String getPhaseGroupName() {
            return this.phaseGroupName;
        }

        public DescribeMPCoSResourceInfoResponseBodyDataPhaseQuotaInfoList setPhaseQuota(Long phaseQuota) {
            this.phaseQuota = phaseQuota;
            return this;
        }
        public Long getPhaseQuota() {
            return this.phaseQuota;
        }

        public DescribeMPCoSResourceInfoResponseBodyDataPhaseQuotaInfoList setUsedPhase(Long usedPhase) {
            this.usedPhase = usedPhase;
            return this;
        }
        public Long getUsedPhase() {
            return this.usedPhase;
        }

    }

    public static class DescribeMPCoSResourceInfoResponseBodyData extends TeaModel {
        @NameInMap("MemberQuota")
        public Long memberQuota;

        @NameInMap("PhaseGroupQuota")
        public Long phaseGroupQuota;

        @NameInMap("PhaseQuotaInfoList")
        public java.util.List<DescribeMPCoSResourceInfoResponseBodyDataPhaseQuotaInfoList> phaseQuotaInfoList;

        @NameInMap("UsedMember")
        public Long usedMember;

        @NameInMap("UsedPhaseGroup")
        public Long usedPhaseGroup;

        public static DescribeMPCoSResourceInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMPCoSResourceInfoResponseBodyData self = new DescribeMPCoSResourceInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMPCoSResourceInfoResponseBodyData setMemberQuota(Long memberQuota) {
            this.memberQuota = memberQuota;
            return this;
        }
        public Long getMemberQuota() {
            return this.memberQuota;
        }

        public DescribeMPCoSResourceInfoResponseBodyData setPhaseGroupQuota(Long phaseGroupQuota) {
            this.phaseGroupQuota = phaseGroupQuota;
            return this;
        }
        public Long getPhaseGroupQuota() {
            return this.phaseGroupQuota;
        }

        public DescribeMPCoSResourceInfoResponseBodyData setPhaseQuotaInfoList(java.util.List<DescribeMPCoSResourceInfoResponseBodyDataPhaseQuotaInfoList> phaseQuotaInfoList) {
            this.phaseQuotaInfoList = phaseQuotaInfoList;
            return this;
        }
        public java.util.List<DescribeMPCoSResourceInfoResponseBodyDataPhaseQuotaInfoList> getPhaseQuotaInfoList() {
            return this.phaseQuotaInfoList;
        }

        public DescribeMPCoSResourceInfoResponseBodyData setUsedMember(Long usedMember) {
            this.usedMember = usedMember;
            return this;
        }
        public Long getUsedMember() {
            return this.usedMember;
        }

        public DescribeMPCoSResourceInfoResponseBodyData setUsedPhaseGroup(Long usedPhaseGroup) {
            this.usedPhaseGroup = usedPhaseGroup;
            return this;
        }
        public Long getUsedPhaseGroup() {
            return this.usedPhaseGroup;
        }

    }

}
