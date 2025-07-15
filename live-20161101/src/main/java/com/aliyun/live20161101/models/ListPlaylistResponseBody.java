// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListPlaylistResponseBody extends TeaModel {
    /**
     * <p>The episode lists.</p>
     */
    @NameInMap("ProgramList")
    public java.util.List<ListPlaylistResponseBodyProgramList> programList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5c6a2a0d-f228-4a64-af62-20e91b96****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of episode lists returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListPlaylistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPlaylistResponseBody self = new ListPlaylistResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPlaylistResponseBody setProgramList(java.util.List<ListPlaylistResponseBodyProgramList> programList) {
        this.programList = programList;
        return this;
    }
    public java.util.List<ListPlaylistResponseBodyProgramList> getProgramList() {
        return this.programList;
    }

    public ListPlaylistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPlaylistResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListPlaylistResponseBodyProgramList extends TeaModel {
        /**
         * <p>The ID of the production studio to which the episode list belongs. You can use the ID as a request parameter in the API operation that is used to add a layout to the virtual studio, delete a layout in the virtual studio, modify a layout of the virtual studio, or query layouts of the virtual studio.</p>
         * 
         * <strong>example:</strong>
         * <p>casdfasdfasfdasdflkasjdflaj****</p>
         */
        @NameInMap("CasterId")
        public String casterId;

        /**
         * <p>The main streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The ID of the episode list.</p>
         * 
         * <strong>example:</strong>
         * <p>c09f3d63-eacf-4fbf-bd48-a07a6ba7****</p>
         */
        @NameInMap("ProgramId")
        public String programId;

        /**
         * <p>The name of the episode list.</p>
         * 
         * <strong>example:</strong>
         * <p>playlist1</p>
         */
        @NameInMap("ProgramName")
        public String programName;

        /**
         * <p>The number of playbacks after the first playback is complete. Valid values:</p>
         * <ul>
         * <li><strong>0</strong> (default): specifies that the episode list is played only once.</li>
         * <li><strong>-1</strong>: specifies that the episode list is played in loop mode.</li>
         * <li>Positive integer: specifies the number of times the episode list repeats after the first playback is complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RepeatNumber")
        public Integer repeatNumber;

        /**
         * <p>The status of the episode list. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: stopped</li>
         * <li><strong>1</strong>: running</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static ListPlaylistResponseBodyProgramList build(java.util.Map<String, ?> map) throws Exception {
            ListPlaylistResponseBodyProgramList self = new ListPlaylistResponseBodyProgramList();
            return TeaModel.build(map, self);
        }

        public ListPlaylistResponseBodyProgramList setCasterId(String casterId) {
            this.casterId = casterId;
            return this;
        }
        public String getCasterId() {
            return this.casterId;
        }

        public ListPlaylistResponseBodyProgramList setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListPlaylistResponseBodyProgramList setProgramId(String programId) {
            this.programId = programId;
            return this;
        }
        public String getProgramId() {
            return this.programId;
        }

        public ListPlaylistResponseBodyProgramList setProgramName(String programName) {
            this.programName = programName;
            return this;
        }
        public String getProgramName() {
            return this.programName;
        }

        public ListPlaylistResponseBodyProgramList setRepeatNumber(Integer repeatNumber) {
            this.repeatNumber = repeatNumber;
            return this;
        }
        public Integer getRepeatNumber() {
            return this.repeatNumber;
        }

        public ListPlaylistResponseBodyProgramList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
