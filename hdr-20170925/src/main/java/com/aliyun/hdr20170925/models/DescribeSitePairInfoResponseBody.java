// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeSitePairInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PrimarySiteInfo")
    public DescribeSitePairInfoResponseBodyPrimarySiteInfo primarySiteInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecondarySiteInfo")
    public DescribeSitePairInfoResponseBodySecondarySiteInfo secondarySiteInfo;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeSitePairInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSitePairInfoResponseBody self = new DescribeSitePairInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSitePairInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSitePairInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSitePairInfoResponseBody setPrimarySiteInfo(DescribeSitePairInfoResponseBodyPrimarySiteInfo primarySiteInfo) {
        this.primarySiteInfo = primarySiteInfo;
        return this;
    }
    public DescribeSitePairInfoResponseBodyPrimarySiteInfo getPrimarySiteInfo() {
        return this.primarySiteInfo;
    }

    public DescribeSitePairInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSitePairInfoResponseBody setSecondarySiteInfo(DescribeSitePairInfoResponseBodySecondarySiteInfo secondarySiteInfo) {
        this.secondarySiteInfo = secondarySiteInfo;
        return this;
    }
    public DescribeSitePairInfoResponseBodySecondarySiteInfo getSecondarySiteInfo() {
        return this.secondarySiteInfo;
    }

    public DescribeSitePairInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeSitePairInfoResponseBodyPrimarySiteInfo extends TeaModel {
        @NameInMap("DiskSizeOfProtectedServers")
        public Long diskSizeOfProtectedServers;

        @NameInMap("DiskSizeOfShadowServers")
        public Long diskSizeOfShadowServers;

        @NameInMap("NumberOfProtectedServers")
        public Integer numberOfProtectedServers;

        @NameInMap("NumberOfRecoveryPoints")
        public Integer numberOfRecoveryPoints;

        @NameInMap("NumberOfShadowServers")
        public Integer numberOfShadowServers;

        @NameInMap("NumberOfUnProtectedServers")
        public Integer numberOfUnProtectedServers;

        public static DescribeSitePairInfoResponseBodyPrimarySiteInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeSitePairInfoResponseBodyPrimarySiteInfo self = new DescribeSitePairInfoResponseBodyPrimarySiteInfo();
            return TeaModel.build(map, self);
        }

        public DescribeSitePairInfoResponseBodyPrimarySiteInfo setDiskSizeOfProtectedServers(Long diskSizeOfProtectedServers) {
            this.diskSizeOfProtectedServers = diskSizeOfProtectedServers;
            return this;
        }
        public Long getDiskSizeOfProtectedServers() {
            return this.diskSizeOfProtectedServers;
        }

        public DescribeSitePairInfoResponseBodyPrimarySiteInfo setDiskSizeOfShadowServers(Long diskSizeOfShadowServers) {
            this.diskSizeOfShadowServers = diskSizeOfShadowServers;
            return this;
        }
        public Long getDiskSizeOfShadowServers() {
            return this.diskSizeOfShadowServers;
        }

        public DescribeSitePairInfoResponseBodyPrimarySiteInfo setNumberOfProtectedServers(Integer numberOfProtectedServers) {
            this.numberOfProtectedServers = numberOfProtectedServers;
            return this;
        }
        public Integer getNumberOfProtectedServers() {
            return this.numberOfProtectedServers;
        }

        public DescribeSitePairInfoResponseBodyPrimarySiteInfo setNumberOfRecoveryPoints(Integer numberOfRecoveryPoints) {
            this.numberOfRecoveryPoints = numberOfRecoveryPoints;
            return this;
        }
        public Integer getNumberOfRecoveryPoints() {
            return this.numberOfRecoveryPoints;
        }

        public DescribeSitePairInfoResponseBodyPrimarySiteInfo setNumberOfShadowServers(Integer numberOfShadowServers) {
            this.numberOfShadowServers = numberOfShadowServers;
            return this;
        }
        public Integer getNumberOfShadowServers() {
            return this.numberOfShadowServers;
        }

        public DescribeSitePairInfoResponseBodyPrimarySiteInfo setNumberOfUnProtectedServers(Integer numberOfUnProtectedServers) {
            this.numberOfUnProtectedServers = numberOfUnProtectedServers;
            return this;
        }
        public Integer getNumberOfUnProtectedServers() {
            return this.numberOfUnProtectedServers;
        }

    }

    public static class DescribeSitePairInfoResponseBodySecondarySiteInfo extends TeaModel {
        @NameInMap("DiskSizeOfProtectedServers")
        public Long diskSizeOfProtectedServers;

        @NameInMap("DiskSizeOfShadowServers")
        public Long diskSizeOfShadowServers;

        @NameInMap("NumberOfProtectedServers")
        public Integer numberOfProtectedServers;

        @NameInMap("NumberOfRecoveryPoints")
        public Integer numberOfRecoveryPoints;

        @NameInMap("NumberOfShadowServers")
        public Integer numberOfShadowServers;

        @NameInMap("NumberOfUnProtectedServers")
        public Integer numberOfUnProtectedServers;

        public static DescribeSitePairInfoResponseBodySecondarySiteInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeSitePairInfoResponseBodySecondarySiteInfo self = new DescribeSitePairInfoResponseBodySecondarySiteInfo();
            return TeaModel.build(map, self);
        }

        public DescribeSitePairInfoResponseBodySecondarySiteInfo setDiskSizeOfProtectedServers(Long diskSizeOfProtectedServers) {
            this.diskSizeOfProtectedServers = diskSizeOfProtectedServers;
            return this;
        }
        public Long getDiskSizeOfProtectedServers() {
            return this.diskSizeOfProtectedServers;
        }

        public DescribeSitePairInfoResponseBodySecondarySiteInfo setDiskSizeOfShadowServers(Long diskSizeOfShadowServers) {
            this.diskSizeOfShadowServers = diskSizeOfShadowServers;
            return this;
        }
        public Long getDiskSizeOfShadowServers() {
            return this.diskSizeOfShadowServers;
        }

        public DescribeSitePairInfoResponseBodySecondarySiteInfo setNumberOfProtectedServers(Integer numberOfProtectedServers) {
            this.numberOfProtectedServers = numberOfProtectedServers;
            return this;
        }
        public Integer getNumberOfProtectedServers() {
            return this.numberOfProtectedServers;
        }

        public DescribeSitePairInfoResponseBodySecondarySiteInfo setNumberOfRecoveryPoints(Integer numberOfRecoveryPoints) {
            this.numberOfRecoveryPoints = numberOfRecoveryPoints;
            return this;
        }
        public Integer getNumberOfRecoveryPoints() {
            return this.numberOfRecoveryPoints;
        }

        public DescribeSitePairInfoResponseBodySecondarySiteInfo setNumberOfShadowServers(Integer numberOfShadowServers) {
            this.numberOfShadowServers = numberOfShadowServers;
            return this;
        }
        public Integer getNumberOfShadowServers() {
            return this.numberOfShadowServers;
        }

        public DescribeSitePairInfoResponseBodySecondarySiteInfo setNumberOfUnProtectedServers(Integer numberOfUnProtectedServers) {
            this.numberOfUnProtectedServers = numberOfUnProtectedServers;
            return this;
        }
        public Integer getNumberOfUnProtectedServers() {
            return this.numberOfUnProtectedServers;
        }

    }

}
